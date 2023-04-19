CREATE TABLE students (
	sid int NOT NULL PRIMARY KEY,
    name varchar(200) NOT NULL
);

CREATE TABLE teachers (
	tid int NOT NULL PRIMARY KEY,
    name varchar(200) NOT NULL
);

CREATE TABLE subjects (
	subid int NOT NULL PRIMARY KEY,
    name varchar(200) NOT NULL
);

CREATE TABLE grades(
	studentID int NOT NULL REFERENCES students(sid),
    teacherID int NOT NULL REFERENCES teachers(tid),
    subjectID int NOT NULL REFERENCES subjects(subid),
    grade int NOT NULL,
    PRIMARY KEY(studentID, teacherID, subjectID)
);

-- Insert data in students table

INSERT INTO students (sid, name) VALUES(1, 'Simon');
INSERT INTO students (sid, name) VALUES(2, 'Alvin');
INSERT INTO students (sid, name) VALUES(3, 'Theo');
INSERT INTO students (sid, name) VALUES(4, 'Brittany');
INSERT INTO students (sid, name) VALUES(5, 'Jenette');
INSERT INTO students (sid, name) VALUES(6, 'Elenor');
INSERT INTO students (sid, name) VALUES(7, 'Stu');

SELECT * FROM students;

-- Insert data in teachers table

INSERT INTO teachers (tid, name) VALUES (1, 'Washington');
INSERT INTO teachers (tid, name) VALUES (2, 'Adams');
INSERT INTO teachers (tid, name) VALUES (3, 'Jefferson');
INSERT INTO teachers (tid, name) VALUES (4, 'Lincoln');

SELECT * FROM teachers;

-- Insert data in subjects table

INSERT INTO subjects (subid, name) VALUES (1, 'History');
INSERT INTO subjects (subid, name) VALUES (2, 'Biology');
INSERT INTO subjects (subid, name) VALUES (3, 'Math');

SELECT * FROM subjects;

-- Insert data in grades table

INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 1, 9);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 2, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 3, 6);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 2, 4);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 1, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (2, 4, 3, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (3, 4, 3, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 3, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 1, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 3, 3);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 2, 5);

SELECT * FROM grades;

-- all of the students ordering by name 
SELECT * FROM students order by name desc;
SELECT name FROM students order by name ASC;


-- Grade in History for Simon
SELECT gr.grade, st.name from grades gr, students st  where st.name = 'Simon' and gr.subjectID = 1 and st.sid = gr.studentID;
SELECT grade from grades where subjectID in (select subid from subjects WHERE name = 'History')
and subjectID = (select subid from subjects WHERE name = 'History');
-- Students names who not yet taken any classes
SELECT sid, name FROM students where sid not in (select studentId from grades);

-- Students names who have taken at least one class
SELECT name FROM students where sid in (select studentId from grades);

-- Names of the teachers who haven't any classes
SELECT name from teachers where tid not in (select teacherID from grades);

-- What is id for Biology
select subid from subjects WHERE name = 'Biology';

-- Names of teachers who have taught Biology
SELECT name FROM teachers where tid in 
	(SELECT teacherId FROM grades WHERE subjectID =
		(SELECT subid FROM subjects where name = 'Biology')
	);
    
-- count rows
select count(*) from grades;

-- SUM column elements
select sum(grade) FROM grades;
select avg(grade) as AVERAGE_GRADE FROM grades;

select sum(grade) from grades where studentID = (SELECT sid from students where name = 'Simon');

select round(avg(grade),2) from grades where studentID = (SELECT sid from students where name = 'Simon');

select min(grade) as 'Minimum grade', max(grade) as 'Maximum grade' from grades;