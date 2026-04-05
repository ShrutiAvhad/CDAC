DROP TRIGGER IF EXISTS deleteStudent;
DELIMITER $

CREATE TRIGGER deleteStudent AFTER DELETE ON student for each row
BEGIN
	insert into student_log(ID, namefirst, namelast, DOB, emailID)
    values(old.ID, old.namefirst, old.namelast, old.DOB, old.emailID);

END $
DELIMITER ;