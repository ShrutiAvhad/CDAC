DROP TRIGGER IF EXISTS insertValidation ;
DELIMITER $ 

CREATE TRIGGER insertValidation BEFORE INSERT ON student for each row
BEGIN

	if dayname(curdate()) = 'Sunday' THEN
		signal sqlstate '45000' set message_text = "can't insert today";
    END IF ;
    
END $
DELIMITER ;