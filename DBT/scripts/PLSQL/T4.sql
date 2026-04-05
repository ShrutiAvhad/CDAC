DROP TRIGGER IF EXISTS updateStudent;
DELIMITER $

CREATE TRIGGER updateStudent after UPDATE on student for each row
BEGIN

	IF old.emailID <> new.emailID THEN
		INSERT into student_log(ID, namefirst, namelast, DOB, emailID)
        values(new.ID, new.namefirst, new.namelast, new.DOB, new.emailID);
	END IF ;

END $
DELIMITER ;