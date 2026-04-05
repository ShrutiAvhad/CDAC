DROP PROCEDURE IF EXISTS checkUser;
DELIMITER $

CREATE PROCEDURE checkUser(IN e varchar(100)) 
BEGIN
	
    IF EXISTS(SELECT 1 FROM LOGIN where emailID = e) THEN
		select Concat(username," ",password) from login
        WHERE emailID = e;
        
	ELSE
		insert into log(curr_date, curr_time, message)
		values(curdate(), curtime(), "Not available");
	END IF ;
END $
DELIMITER ;