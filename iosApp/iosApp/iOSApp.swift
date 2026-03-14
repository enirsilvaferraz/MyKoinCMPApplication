import SwiftUI
import IOSApp

@main
struct iOSApp: App {

    init() {
        
        let container = DependencyInjector.createContainer()

        AppModuleKt.doInitKoin {_ in }
        
        Module1ContractKt.startModule1(dependency1: { _ in container.resolve(NativePlatformDependency1.self)! })
        Module2ContractKt.startModule2(dependency2: { _ in container.resolve(NativePlatformDependency2.self)! })
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
