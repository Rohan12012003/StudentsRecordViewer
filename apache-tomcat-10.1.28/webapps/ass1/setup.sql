-- Create the database
CREATE DATABASE IF NOT EXISTS StudentRecords;

-- Use the database
USE StudentRecords;

-- Create the students table
CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    enrollment_date DATE NOT NULL
);

-- Insert data into the students table
INSERT INTO students (first_name, last_name, email, enrollment_date) VALUES
('ROHAN', 'DUTTA', 'rohandutta030620@gmail.com', '2021-12-07'),
('Ranit', 'Dutta', 'ranit@gmail.com', '2022-06-14'),
('Rudra', 'Roy', 'Rudra@gmail.com', '2003-01-17'),
('Rony', 'Sarkar', 'polio@gmail.com', '2024-08-07'),
('Parthib', 'Chowdhury', 'parthib04@gmail.com', '2024-08-29'),
('Dishita', 'Barman', 'dishita@gmail.com', '2024-06-19'),
('Gaurav', 'Sharma', 'gaurav@sharma.gmail.com', '2019-06-27'),
('sandip', 'murmu', 'sandip@hotmail.com', '2024-08-07'),
('sayan', 'mondal', 'abc@gmail.com', '2024-08-22');


