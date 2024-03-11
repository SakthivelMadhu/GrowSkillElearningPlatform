CREATE TABLE user (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    -- Other user fields...
);

CREATE TABLE course (
    course_id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    instructor VARCHAR(50) NOT NULL,
    -- Other course fields...
);

CREATE TABLE enrollment (
    enrollment_id SERIAL PRIMARY KEY,
    user_id INT NOT NULL,
    course_id INT NOT NULL,
    enrollment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES user(user_id),
    FOREIGN KEY (course_id) REFERENCES course(course_id)
);


-- 1. Get all courses
SELECT * FROM courses;

-- 2. Get all users
SELECT * FROM users;

-- 3. Get all enrollments
SELECT * FROM enrollments;

-- 4. Get all courses for a specific user
SELECT courses.*
FROM courses
JOIN enrollments ON courses.course_id = enrollments.course_id
WHERE enrollments.user_id = <user_id>;

-- 5. Get all users enrolled in a specific course
SELECT users.*
FROM users
JOIN enrollments ON users.user_id = enrollments.user_id
WHERE enrollments.course_id = <course_id>;

-- 6. Create a new course
INSERT INTO courses (title, instructor) VALUES ('New Course Title', 'Instructor Name');

-- 7. Create a new user
INSERT INTO users (username) VALUES ('new_user');

-- 8. Enroll a user in a course
INSERT INTO enrollments (course_id, user_id) VALUES (<course_id>, <user_id>);

-- 9. Delete a course
DELETE FROM courses WHERE course_id = <course_id>;

-- 10. Update course details
UPDATE courses SET title = 'Updated Title', instructor = 'Updated Instructor' WHERE course_id = <course_id>;
