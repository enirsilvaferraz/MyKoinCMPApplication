import IOSApp
import Swinject

class iOSProviderImpl: Module1DependencyProvider {
    
    private let container: Container

    init(container: Container) {
        self.container = container
    }
    
    func provideDependency1() -> NativePlatformDependency1 {
        return container.resolve(NativePlatformDependency1.self)!
    }
    
    func provideDependency2() -> NativePlatformDependency2 {
        return container.resolve(NativePlatformDependency2.self)!
    }
}
