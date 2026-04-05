DROP PROCEDURE IF EXISTS addQualification;
DELIMITER $

CREATE PROCEDURE addQualification(
	IN q_ID int,
	IN q_studentID int, 
    IN q_name varchar(30),
    IN q_college varchar(20),
    IN q_university varchar(20),
    IN q_marks int,
    IN q_year int,
    OUT message varchar(100)
)
BEGIN
	IF EXISTS(SELECT 1 from student where ID = q_studentID) THEN
		INSERT INTO student_qualifications(ID, studentID, name, college, university, marks, year)
        VALUES(q_ID, q_studentID, q_name, q_college, q_university, q_marks, q_year);
		
        SET message = "Record Inserted";
	ELSE
		SET message = "Student not found";
    END IF;
	
END $
DELIMITER ;
