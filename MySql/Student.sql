create database student;

create table details(
studentName varchar(40),
phonenumber long,
email varchar(50),
address varchar(80),
collegeName varchar(100)

);
-- adding the column from another table
CREATE TABLE brand.adidas1 AS SELECT studentName FROM student.details;

-- The following are the queries to alter the table

ALTER TABLE details ADD  COLUMN countrys varchar(40);
ALTER TABLE details DROP COLUMN countrys;
ALTER TABLE details RENAME COLUMN countrys TO country;
ALTER TABLE details MODIFY COLUMN country int;  

-- INSERT the values
-- for all column
INSERT INTO details VALUES ('Shubhangi',6364123100,'shubhangi@gmail.com','near balaji temple','BGMIT');
-- for specific column
INSERT INTO details(phonenumber,collegeName) VALUES(9483735700,"Gogte");
SELECT * from details;-- all column
SELECT phonenumber from details;-- specific column

-- if we want to create unique values so we use unique is an (constraints) as a keyword
-- ex for constraints:UNIQUE,DEFAULT
-- for id when we make unique then it vl not take the duplicate..

-- if we want anything that must be not equal to null we need to provide 
-- Alter table tableName Modify column columnName datatype not null.. 