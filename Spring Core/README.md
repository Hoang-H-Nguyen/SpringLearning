# Inversion of Control (IoC)

The approach of outsourcing the construction and management of objects

## Spring Container
Works as Object Factory, Spring will determine which object that you need based on a configuration, then give you reference.

Primary functions:
- Create and Manage Objects (Inversion of Control)
- Inject object dependencies (Dependency Injection)

Configuration of Spring Container:
Java Annotations (modern)
Java Source Code (modern)
XML file (legacy)

## Dependency Injection
Using dependency inversion principle, the client delegates (ủy quyền cho) to another object the responsibility of providing its dependencies.

2 recommend types:
- Constructor Injection: when having required dependencies 
- Setter Injection: when having optional dependencies

## Spring Autowiring:
For dependency injection, Spring can use Autowiring, looking for a class that matches:
- match by type: class or interface
Spring will inject automatically
Example:
- Injecting an Object implementation
- Spring will scan for @Components, @Component annotation marks the class as a Spring Bean (a regular Java class is managed by Spring, makes the bean available for dependency injection)
- Any class implements that Object interface
- If so, let's inject them.


## If multiple beans 
- @Qualifier: specified the bean name class, no uppercase, more specific, higher priority than @Primary
- @Primary: only one primary class

## Lazy initialization with @Lazy
Advantages:
- Only create objects as needed
- May help with faster startup time if you have large number of components
Disadvantages:
- If having web related components like @RestController, not created until requested.
- Make sure having enough memory for all beans once created.

## Bean Scope
Default is singleton
- singleton: create a single shared instance of  the bean
- prototype: create a new bean instance for each container request
- request: scoped to an HTTP web request. Only used for web apps
- session: scoped to an HTTP web session.. Only used for web apps
- global-session: scoped to a global HTTP web session. Only used for web apps

## @Bean annotation
Make an existing third-party class available to spring framework.