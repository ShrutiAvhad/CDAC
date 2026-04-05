DROP FUNCTION IF EXISTS total;
DELIMITER $

CREATE FUNCTION total(i int) returns int
DETERMINISTIC
BEGIN	
	declare result int ;
    select sum(marks) into result
    from student_qualifications where studentID =  i ;
    return result ;
    
END $
DELIMITER ;