DROP FUNCTION IF EXISTS mail;
DELIMITER $

CREATE FUNCTION mail(m varchar(50)) 
RETURNS varchar(100)
deterministic

BEGIN
	declare result varchar(100);
    
    IF EXISTS (select 1 from login where emailID = m) THEN
		select concat(username, " ", password) into result from login where emailID = m;
	ELSE 
		set result = 'Employee not exists';
	END IF;
    
    RETURN result;
END $

DELIMITER ;