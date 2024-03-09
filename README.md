# GrowSkillElearningPlatform

## Description
This is a Spring Boot project for the GrowSkill e-learning platform. It includes functionalities for managing courses, user enrollment, and more.



```
Name : SAKTHIVEL MADHU
Phone : 75388 37154
Email : sakthi130597@gmail.com
github : https://github.com/SakthivelMadhu/GrowSkillElearningPlatform
Linkedin : https://www.linkedin.com/in/sakthivel-madhu-864647238/
```
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

ER Diagram or DB Diagram : ![Screenshot 2024-03-09 123757](https://github.com/SakthivelMadhu/GrowSkillElearningPlatform/assets/62326876/2ab74178-eca0-42aa-b342-6e6cd809b2eb)


## Getting Started
1. Clone the repository.
2. Make sure you have Java and Maven installed.
3. Run `mvn clean install` to build the project.
4. Run the application using `mvn spring-boot:run` or deploy the generated JAR file.

## Usage
- Access the application through the defined endpoints in the controllers.
- Use the provided test classes to understand and extend functionality.



