import SwiftUI
import IOSApp

@main
struct iOSApp: App {

    init() {
        let container = DependencyInjector.createContainer()
        let platformProvider = IOSPlatformProvider(container: container)

        KoinInitHelperKt.doInitKoin(
            featureAProvider: platformProvider,
            featureBProvider: platformProvider,
            additionalModules: []
        )
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
