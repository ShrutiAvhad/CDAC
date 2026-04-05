DROP PROCEDURE IF EXISTS max_no;
DELIMITER $
CREATE PROCEDURE max_no(a int, b int, c int)
BEGIN
	DECLARE max_val int;
    
	IF a>b AND a>c THEN
		SET max_val = a;
        
	ELSEIF b>c AND b>a THEN
		SET max_val = b;
        
	ELSE 
		SET max_val = c;
	
    END IF ;
    
    SELECT max_val AS Maximum_Number ;
    
END $
DELIMITER ;