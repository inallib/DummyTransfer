# HTML Analyzer

This project was created for Scout24 Coding test.

## Getting Started

This is a Spring boot and AngularJs based application.
### Prerequisites

```
Java 8
An IDE
Maven 3.x
```

### Installing in dev environment
```
- Please unzip the folder.
- Open the project in an IDE.
- Go to \src\main\java\com\scout24\htmlAnalyzer\HtmlAnalyzerApplication.java.
- Run the class or open the terminal at the project root and write mvn spring-boot:run hit enter.
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


