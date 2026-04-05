DROP PROCEDURE IF EXISTS a;
DELIMITER $
CREATE PROCEDURE A()
DETERMINISTIC
BEGIN 
	declare x int default 100;
    declare y varchar(20) default "ABC";

	select CONCAT(x," ", y);
END $
DELIMITER ;