# Java Design Patterns

## Technologies Using

1. Java
2. Patterns and Coding Practices
 * Observer
 * Builder Constructor
 * S.O.L.I.D
 * Clean Code principles
3. JSoup
 * jsoup is a Java library for working with real-world HTML. It provides a very convenient API for extracting and manipulating data, using the best of DOM, CSS, and jquery-like methods
4. Network programming
 * Read nerd
5. [GenMyModel - Create Diagrams](https://dashboard.genmymodel.com/)

 
 
## Object-Oriented Fundamentals and Best Practices

1. The Cornerstones of [object-oriented programming](https://en.wikipedia.org/wiki/Object-oriented_programming) (OOP)
 * [Inheritance](http://www.baeldung.com/java-inheritance) and;
 * [Composition](http://www.baeldung.com/java-inheritance-composition) 
 * [Abstraction](https://dzone.com/articles/oop-concept-for-beginners-what-is-abstraction)
 * [Encapsulation](https://stackify.com/oop-concept-for-beginners-what-is-encapsulation/)
 * [Polymorphism](https://stackoverflow.com/questions/1031273/what-is-polymorphism-what-is-it-for-and-how-is-it-used?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa) 
2. [Guide to Java Reflection | Baeldung](http://www.baeldung.com/java-reflection)
3. [Clean Code Principles (My Bible :))](https://marcus-biel.com/clean-code-principles/)
4. [S.O.L.I.D](https://dzone.com/articles/the-solid-principles-in-real-life)
 * Single responsibility principle - A class should have only one reason to change.
 * Open/Closed principle - Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
 * Liskov Substitution Principle - Child classes should never break the parent class type definitions.
 * Interface Segregation Principle - No client should be forced to depend on methods it does not use.
 * Dependency inversion principle - High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend upon details. Details should depend upon abstractions.
 * [SOLID Design Principles Explained – Dependency Inversion Principle with Code Examples](https://stackify.com/dependency-inversion-principle/)
5. [UML Diagrams](https://tallyfy.com/uml-diagram/)
 


## Design Pattern Types

According to the Gang Of Four (GoF), design patterns can be classified into three types:

1. [Creational:](http://www.baeldung.com/creational-design-patterns) Creational design patterns are responsible for efficient object creation mechanisms, which increase the flexibility and reuse of existing code
2. [Structural:](https://refactoring.guru/design-patterns/structural-patterns) Simply put, Structural Patterns deal with the composition of classes and objects. They provide different ways of using object composition and inheritance to create some abstraction.
3. [Behavioural:](https://refactoring.guru/design-patterns/behavioral-patterns) Behavioral patterns are responsible for the efficient and safe distribution of behaviors among the program's objects



## Design Patterns

1. [Structural Patterns:](https://refactoring.guru/design-patterns/structural-patterns) 
 * [Proxy, Decorator, Adapter and Bridge Patterns by Baeldung](http://www.baeldung.com/java-structural-design-patterns)
 * [Facade(REST)](https://dzone.com/articles/design-patterns-uncovered-1)
 * [Flyweight](https://nobugsproject.com/2017/10/11/design-patterns-saga-18-real-project-situations-with-flyweight/)
2. [Creational Patterns](http://www.baeldung.com/creational-design-patterns)
 * [Builder Pattern( While Writing Unit Tests )](https://stackoverflow.com/questions/5007355/builder-pattern-in-effective-java)
 * [Factory Pattern(Web framewroks)](https://dzone.com/articles/java-the-factory-pattern)
 * [Singleton](https://stackoverflow.com/questions/70689/what-is-an-efficient-way-to-implement-a-singleton-pattern-in-java)
3. [Behavioural Patterns](https://refactoring.guru/design-patterns/behavioral-patterns)
 * [Strategy Pattern(Dependency Injection)](https://dzone.com/articles/java-the-strategy-pattern)
 * [Observer Pattern by Baeldung](http://www.baeldung.com/java-observer-pattern)
  * [Observer Pattern(Event Listener)](https://dzone.com/articles/the-observer-pattern-using-modern-java)
4. [Architectural Pattern](https://en.wikipedia.org/wiki/Architectural_pattern)
5. Popular Patterns
 * [The Big Ball of Mud :)](https://en.wikipedia.org/wiki/Big_ball_of_mud)
   

   
## Architecture

1. [AWS Architecture](https://aws.amazon.com/architecture/)
 * [Architecture Diagrams](https://www.pinterest.ie/pin/375487687655604514/)
2. [Load Balancing](http://tutorials.jenkov.com/software-architecture/load-balancing.html) 
 * [Types of Load Balancing](https://www.esds.co.in/blog/types-of-load-balancing/#sthash.zghIRpCv.dpbs)
3. [Service-Oriented Architecture (SOA)]()
 * [Messaging, (e.g. ActiveMQ, JMS, RabbitMQ, IBM MQ]()
 * [WCF](https://en.wikipedia.org/wiki/Windows_Communication_Foundation) (Microsoft's implementation of Web services, forming a part of WCF)
 * [Web services](https://en.wikipedia.org/wiki/Web_services) based on WSDL and [SOAP](https://en.wikipedia.org/wiki/SOAP)
 * RESTful HTTP, with [Representational state transfer (REST)](https://en.wikipedia.org/wiki/Representational_state_transfer) constituting its own constraints-based architectural style
4. [Java Messaging Service (JMS) Architecture](https://docs.oracle.com/cd/E19798-01/821-1841/6nmq2cpp4/index.html) The Java Message Service (JMS) is not in itself a service-oriented architecture (SOA) - it's a transport layer used for components in a SOA to talk to each other. Therefore, you could say that Java Message Service is used as part of a service-oriented architecture. Take note that JMS is a specification and not a piece of software; for example there are ActiveMQ for an open source example, and WebSphere MQ as a commercial one.
 * [JMS broker (Stackoverflow)](https://stackoverflow.com/questions/1035949/real-world-use-of-jms-message-queues?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa)
 * [Apache ActiveMQ (Open source)](https://www.quora.com/topic/ActiveMQ)
 * [IBM WebSphere MQ (Commercial)](https://www.ibm.com/support/knowledgecenter/en/SS9H2Y_7.5.0/com.ibm.dp.doc/mq_basicarchitecture.html)
 * [RabbitMQ (Open source)](https://www.rabbitmq.com/)
5. [Web Server Architecture (e.g. IIS : ASP (.NET), Tomcat : Servlet, Jetty : Servlet, Apache : Php, CGI )]()
 * [Differnece between Application server and Web server](https://stackoverflow.com/questions/936197/what-is-the-difference-between-application-server-and-web-server)
6. [Application Server Architecture (e.g. MTS : COM+, WAS : EJB, JBoss : EJB, WebLogic Application Server : EJB)]()
7. [Software Architecture](http://tutorials.jenkov.com/software-architecture/index.html)
8. [Computer Architecture](http://tutorials.jenkov.com/software-architecture/computer-architecture.html)
   
   
   
## Tutorial
1. [Design Patterns Saga (20+ Patterns by Rafa Del Nero)](https://nobugsproject.com/category/design-patterns-saga/)   
   
   
   
## Observer Pattern

1. [Tutorial Point - Observer Pattern](https://www.tutorialspoint.com/design_pattern/observer_pattern.htm)
2. DZone 
   ** [Observer Pattern Using Java 8](https://bluepenguinlist.com/2016/11/04/bash-scripting-tutorial/?fromTwitterID=nixCraft)
   ** [Observer Pattern Tutorial with Java Examples](https://dzone.com/articles/design-patterns-uncovered)
3. [Vogella: Observer Pattern](http://www.vogella.com/tutorials/DesignPatternObserver/article.html)
4. [dofactory: .NET Observer Pattern](http://www.dofactory.com/net/observer-design-pattern)
5. [Source Making: Observer Pattern](https://sourcemaking.com/design_patterns/observer)
6. [DevJournal](http://www.journaldev.com/1739/observer-design-pattern-in-java)
7. [Wikipedia: Publish–subscribe pattern](https://en.wikipedia.org/wiki/Publish%E2%80%93subscribe_pattern)



## Video
1. [Functional Programming Patterns with Java8 with Victor Rentea (Clean Code)](https://www.youtube.com/watch?v=F02LKnWJWF4&feature=youtu.be)
