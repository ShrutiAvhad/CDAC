DROP PROCEDURE IF EXISTS PrintEvenNumbers;
DELIMITER $
CREATE PROCEDURE PrintOddNumbers(IN n int)
BEGIN
	DECLARE i int default 1;
    odd_loop: LOOP
		IF i > n THEN 
			LEAVE odd_loop;
		END IF ;
			SELECT i ;
            SET i = i+2;
		END LOOP ;
END $
DELIMITER ;