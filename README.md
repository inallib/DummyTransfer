# HTML Analyzer

This project was created for Scout24 Coding test. Please refer the Design decisions, assumptions and limitations at the bottom.

## Getting Started

This is a Spring boot and AngularJs based application.
### Prerequisites

```
Java 8
An IDE
Maven 3.x
IntelliJ (Preferably) / Eclipse/ Or any
```

### Preparing dev environment
```
- Please unzip the folder.
- Open the project in an IDE.
- Go to \src\main\java\com\scout24\htmlAnalyzer\HtmlAnalyzerApplication.java.
- Build the application with - mvn clean install.
- Run the class or type mvn spring-boot:run hit enter.
- Hit http://localhost:8080/ in browser
```
## Running the tests
### Junit unit test

The test case include rest api test with Mock, testing a util class, testing of service class. To run the test cases, type below command in terminal at the project root and hit enter.

```
mvn test
```

### Jasmin unit test for AngularJs

The test case include controller test with Mock. To run the test cases, open \src\main\resources\static\js\SpecRunner.html in browser.

## Assumptions, design decisions and limitations
### Assumptions
```
- Only one runtime to be used among Java / Scala/ NodeJs.
- Rest endpoints will be used only to this application UI and not to Mobile / Tablet etc.
- No other modules be added to the application.
- This application be run only in desktop and in development mode.
- Making architecture a microservices based one and take care of problem of common microservice based application has would be considered as over engineering.
- Separating the backend in Java and UI in Node based app would be considered as over engineering.
- Introducing caching would be consider as over engineering.
```

### Design decisions
To Build this application
```
- A simple Spring boot / AngularJs based application which does not require a NodeJs to set up for UI. Including libs in the HTML gives us a UI framework.
- Making UI as MVC.
- Making backend as Controller, service layer architecture.
- Not to use TDD in interest of time.
- JUnit and Jasmin to use for unit test.
- This is a single page application with very limited resources. Writing integration test may be overkilling.
- It can be extended later to automated acceptance test using Selenium / Cucumber.
- Error, info will be logged.
- Exceptions are handled and validated.
```

### Limitations

```
- Coverage of Unit test cases are less in the interest of time.
- Acceptance test are something to write in the later stage.
- In order to fire each URL on the page, this may be extended to a multi threaded parallel solution to handle it rather than just a simple sequential operation.
```
