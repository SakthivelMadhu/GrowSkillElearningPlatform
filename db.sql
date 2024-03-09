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
