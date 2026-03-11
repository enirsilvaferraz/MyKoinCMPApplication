# Swinject + Koin: como injetar dependências Swift no Kotlin Multiplatform em projetos multi-módulo

## Introdução

O Kotlin Multiplatform (KMP) resolve um problema antigo do desenvolvimento mobile: compartilhar lógica de negócio entre Android, iOS e Desktop sem reescrever código. Mas existe um cenário que o KMP sozinho não resolve — quando a lógica compartilhada precisa consumir dependências que só existem no mundo nativo de cada plataforma.

Pense em configurações de criptografia de rede, acesso à Keychain, biometria ou qualquer SDK proprietário. No iOS, essas implementações vivem em Swift e muitas vezes já estão registradas em um container de injeção de dependências como o **Swinject**. No Android, o equivalente pode estar em Kotlin puro, gerenciado pelo Hilt, Dagger ou pelo próprio Koin.

Agora imagine um `UseCase` no código compartilhado que depende de duas dessas implementações nativas:

```kotlin
class ModuleUseCase(
    private val dependency1: Module1Dependency1,
    private val dependency2: Module1Dependency2
) {
    fun doSomething() {
        dependency1.doSomething()
        dependency2.doSomething()
    }
}
```

Esse `ModuleUseCase` vive no `commonMain` — código 100% compartilhado. Ele não sabe e nem deve saber se está rodando no iOS, Android ou Desktop. Mas `Module1Dependency1` e `Module1Dependency2` são interfaces cujas implementações concretas vêm de cada plataforma. No iOS, podem ser classes Swift registradas no Swinject. No Android, classes Kotlin gerenciadas pelo Hilt.

Como fazer essas instâncias nativas chegarem até aqui?

### O problema: a direção da dependência

A resposta curta é: **o código compartilhado não consegue enxergar o código nativo — e nem deveria**. A razão é arquitetural.

Em qualquer projeto KMP, a dependência flui do app nativo para as bibliotecas compartilhadas, nunca o contrário. O app iOS (Swift) importa o framework Kotlin. O framework depende dos módulos compartilhados. E os módulos compartilhados estão na base da cadeia — sem referência a nenhum código de aplicação.

Inverter essa seta criaria uma dependência circular. Isso significa que um feature module KMP **nunca** vai referenciar uma classe que vive no app Swift ou no app Android. Ele simplesmente não sabe que elas existem.

No iOS existe ainda uma barreira extra: o Kotlin/Native interage com o ecossistema Apple via **Objective-C**, não Swift. Tipos Swift puros são invisíveis para o Kotlin sem anotações como `@objc`.

Mas o ponto fundamental não é a barreira de interop — é a **direção da dependência**. Mesmo que o Kotlin enxergasse Swift perfeitamente, o módulo compartilhado continuaria sem acesso às classes do app.

### O agravante: projetos multi-módulo

Em um projeto multi-módulo — onde cada feature module define suas próprias dependências nativas — o problema se multiplica. Cada módulo precisa de um mecanismo independente para receber suas dependências da plataforma, sem acoplar um módulo ao outro e sem exigir que todos sejam inicializados em um único ponto central.

### A solução

A resposta está no uso do **Koin** combinado com um **Provider Pattern** e a **inicialização isolada de cada módulo**. Cada feature module expõe um contrato (`startModule`) que recebe um provider da plataforma. Esse provider implementa uma interface Kotlin que serve como ponte — no lado iOS, a implementação vive em Swift e delega para o Swinject; no lado Android, vive em Kotlin puro.

O Koin então extrai as dependências do provider e as disponibiliza no seu grafo de injeção. O `UseCase` recebe tudo via construtor, sem saber se está rodando no iOS, Android ou Desktop.

Neste artigo, vou mostrar passo a passo como esse padrão funciona em um projeto real com Compose Multiplatform, Koin Annotations e Swinject.
