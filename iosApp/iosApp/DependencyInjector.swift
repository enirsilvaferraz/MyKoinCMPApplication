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

        container.register(NativePlatformDependency1.self) { _ in
            iOSDependency1()
        }

        container.register(NativePlatformDependency2.self) { _ in
            iOSDependency2()
        }

        return container
    }
}
