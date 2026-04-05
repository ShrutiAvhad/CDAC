
DROP TRIGGER IF EXISTS insertDuplicate;
DELIMITER $
CREATE TRIGGER insertDuplicate AFTER INSERT ON student FOR EACH ROW

BEGIN
		insert into student_log(ID, namefirst, namelast, DOB, emailID)
		values (new.ID, new.namefirst, new.namelast, new.DOB, new.emailID);
        
END $
DELIMITER ;