import SwiftUI
import IOSApp

@main
struct iOSApp: App {

    init() {
        
        let container = DependencyInjector.createContainer()

        Module1ContractKt.startModule1(provider: iOSProviderModule1(container: container))
        Module2ContractKt.startModule2(provider: iOSProviderModule2(container: container))
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
