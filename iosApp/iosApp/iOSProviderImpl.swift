import IOSApp
import Swinject

class iOSProviderImpl: Module1DependencyProvider {
    
    private let container: Container

    init(container: Container) {
        self.container = container
    }
    
    func provideDependency1() -> Module1Dependency1 {
        return container.resolve(Module1Dependency1.self)!
    }
    
    func provideDependency2() -> Module1Dependency2 {
        return container.resolve(Module1Dependency2.self)!
    }
}
