//
//  IOSPlatformProvider.swift
//  iosApp
//

import IOSApp
import Swinject

class IOSPlatformProvider: FeatureAPlatformProvider, FeatureBPlatformProvider {

    private let container: Container

    init(container: Container) {
        self.container = container
    }

    func getInterfaceDependency() -> InterfaceDependency {
        container.resolve(InterfaceDependency.self)!
    }

    func getLogger() -> Logger {
        container.resolve(Logger.self)!
    }
}
