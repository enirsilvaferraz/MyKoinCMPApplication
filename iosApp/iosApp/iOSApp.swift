import SwiftUI
import IOSApp

@main
struct iOSApp: App {

    init() {
        
        let container = DependencyInjector.createContainer()

        AppModuleKt.doInitKoin { appKoin in
            appKoin.loadModule(
                module: Module1ContractKt.feature1Module(dependency1: { _ in container.resolve(NativePlatformDependency1.self)! })
            )
        }
        

        KoinExtensionsKt.loadModule(
            module: Module2ContractKt.feature2Module(dependency2: { _ in container.resolve(NativePlatformDependency2.self)! })
        )
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
