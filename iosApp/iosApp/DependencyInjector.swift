//
//  DependencyInjector.swift
//  iosApp
//
//  Configura o container Swinject com as dependências da plataforma iOS.
//

import IOSApp
import Swinject

enum DependencyInjector {

    static func createContainer() -> Container {
        let container = Container()

        container.register(InterfaceDependency.self) { _ in
            IOSInterfaceDependecy()
        }

        container.register(Logger.self) { _ in
            IOSLogger()
        }

        return container
    }
}
