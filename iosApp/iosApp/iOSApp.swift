import SwiftUI
import IOSApp

@main
struct iOSApp: App {

    init() {
        
        let container = DependencyInjector.createContainer()        
        Module1ContractKt.startModule1(provider: iOSProviderImpl(container: container))
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
