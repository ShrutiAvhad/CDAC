DROP PROCEDURE IF EXISTS addStudent;
DELIMITER $

CREATE PROCEDURE addStudent(IN a_ID int, a_namefirst varchar(100), a_namelast varchar(100),
							a_DOB date, a_emailID varchar(100), a_number bigint, a_address varchar(100))
                                
BEGIN

	INSERT INTO student(ID, namefirst, namelast, DOB, emailID)
    VALUES(a_ID, a_namefirst, a_namelast, a_DOB, a_emailID);
    
    INSERT INTO student_phone(number)
    VALUES(a_number);
    
    INSERT INTO student_address(address)
    VALUES(a_address);
    
END $
DELIMITER ;