# GrowSkill E-Learning Platform

## Description
GrowSkill is an e-learning platform that provides various paid online live courses in Baking, Makeup, and Handicrafts. The platform allows users to enroll in courses, make payments, attend live sessions, watch course recordings, and download certificates upon completion.

## User Journey
### Enrollment Process
1. User browses courses on the website.
2. User selects a course of interest.
3. User makes the necessary payment for the selected course.
4. After payment, the user can attend the live course sessions on Zoom.
5. At the end of the course, users can access course recordings and download a completion certificate.

# Personal Details :
```
Name : SAKTHIVEL MADHU
Phone : 75388 37154
Email : sakthi130597@gmail.com
github : https://github.com/SakthivelMadhu/GrowSkillElearningPlatform
Linkedin : https://www.linkedin.com/in/sakthivel-madhu-864647238/
```



## Modeling
### Entity-Relationship Diagram (ERD)

```
Table courses {
course_id bigint [pk, increment]
title varchar
instructor varchar
}

Table users {
user_id bigint [pk, increment]
username varchar
}

Table enrollments {
enrollment_id bigint [pk, increment]
course_id bigint
user_id bigint
}

Ref: "courses"."course_id" < "enrollments"."course_id"
Ref: "users"."user_id" < "enrollments"."user_id"
```


![Screenshot 2024-03-09 123757](https://github.com/SakthivelMadhu/GrowSkillElearningPlatform/assets/62326876/2ab74178-eca0-42aa-b342-6e6cd809b2eb)

## Project Structure

### Features
1. **Course Management:**
   - Create, update, and delete courses.

2. **User Management:**
   - Register and manage user accounts.

3. **Enrollment:**
   - Allow users to enroll in courses.

4. **Payment:**
   - Implement a payment system for course enrollment.

5. **Live Sessions:**
   - Integrate Zoom links for live course sessions.

6. **Recordings:**
   - Provide access to course recordings for enrolled users.

7. **Certificate Download:**
   - Enable users to download certificates upon completing a course.


## Implementation

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



