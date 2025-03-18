## Lojinha API Automation
This repository contains the automation of some REST API tests for a software called _Lojinha_. The subtopics below describe some decisions made in the project’s structuring.

## Technologies Used

-Java
-Junit
-RestAssured
-Maven

## Automated Tests
Tests to validate the equivalence partitions related to the product value in _Lojinha_, which are directly linked to the business rule stating that the product value must be between R$0.01 and R$7,000.00.

## General Notes

-   We always use the `@BeforeEach` annotation to capture the token that will be used later in the test methods.
-   We store the data sent to the API using POJO classes.
-   We create initial data using a _Data Factory_ class to facilitate data creation and management.
-   In this project, we use JUnit 5, which allows us to use the `@DisplayName` annotation to provide descriptions for our tests.
