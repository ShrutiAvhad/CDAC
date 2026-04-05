DROP PROCEDURE IF EXISTS ntable;
DELIMITER $

CREATE PROCEDURE ntable(n int)
BEGIN
	DECLARE i int DEFAULT 1;
    
    myloop : LOOP
		IF i > 10 THEN
			LEAVE myloop;
		END IF;
        
        SELECT n*i;
        SET i=i+1;
        
	END LOOP;
END $
DELIMITER ;