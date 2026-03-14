import IOSApp
import Swinject

class iOSProviderModule1: Module1DependencyProvider {
    
    private let container: Container

    init(container: Container) {
        self.container = container
    }
    
    func provideDependency1() -> NativePlatformDependency1 {
        return container.resolve(NativePlatformDependency1.self)!
    }
}
