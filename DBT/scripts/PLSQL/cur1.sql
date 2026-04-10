DROP PROCEDURE IF EXISTS get_grades;
DELIMITER $
CREATE PROCEDURE get_grades(n int)

BEGIN
	DECLARE done int default 0;
    DECLARE marks int;
    
    DECLARE cur CURSOR FOR SELECT marks FROM student_qualifications;
    DECLARE continue handler for not found set done = 1;
    
    open cur;
    
    read_loop : loop
		fetch cur into marks;
        IF done then
			LEAVE read_loop;
		End if;
        
        IF marks >= 90 THEN 
			select 'A+' AS grade;
		ELSEIF marks >= 80 THEN 
			SELECT 'A' AS grade;
		ELSEIF marks >= 70 THEN 
			SELECT 'B+' AS grade;
		ELSEIF marks >= 80 THEN 
			SELECT 'A' AS grade;
		End IF;
		End loop;
        close cur;
END $
DELIMITER ;