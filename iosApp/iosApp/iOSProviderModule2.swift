import IOSApp
import Swinject

class iOSProviderModule2: Module2DependencyProvider {
    
    private let container: Container

    init(container: Container) {
        self.container = container
    }
    
    func provideDependency2() -> NativePlatformDependency2 {
        return container.resolve(NativePlatformDependency2.self)!
    }
}
