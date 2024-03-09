# GrowSkillElearningPlatform

## Description
This is a Spring Boot project for the GrowSkill e-learning platform. It includes functionalities for managing courses, user enrollment, and more.

## Project Structure

```
GrowSkillElearningPlatform
|-- src
|   |-- main
|       |-- java
|           |-- com.growskill
|               |-- controller
|               |   |-- CourseController.java
|               |   |-- UserController.java
|               |-- model
|               |   |-- User.java
|               |   |-- Course.java
|               |   |-- Enrollment.java
|               |-- repository
|               |   |-- UserRepository.java
|               |   |-- CourseRepository.java
|               |   |-- EnrollmentRepository.java
|               |-- service
|               |   |-- UserService.java
|               |   |-- CourseService.java
|               |   |-- EnrollmentService.java
|               |-- exception
|               |   |-- CourseNotFoundException.java
|               |   |-- UserNotFoundException.java
|               |   |-- EnrollmentNotFoundException.java
|-- resources
|   |-- application.properties
|-- test
    |-- java
        |-- com.growskill
            |-- controller
            |   |-- CourseControllerTest.java
            |   |-- UserControllerTest.java
            |-- service
                |-- UserServiceTest.java
                |-- CourseServiceTest.java
                |-- EnrollmentServiceTest.java
```



## Getting Started
1. Clone the repository.
2. Make sure you have Java and Maven installed.
3. Run `mvn clean install` to build the project.
4. Run the application using `mvn spring-boot:run` or deploy the generated JAR file.

## Usage
- Access the application through the defined endpoints in the controllers.
- Use the provided test classes to understand and extend functionality.



