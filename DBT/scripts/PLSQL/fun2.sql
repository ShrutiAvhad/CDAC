	DROP FUNCTION IF EXISTS autoNumber;
    DELIMITER $
    
    CREATE FUNCTION autoNumber( ) returns int
    deterministic
    begin
		
        declare newID int;
        
        select ifnull(max(studentID), 0) + 1 into newID from student_new;
        
        return newID;
    end $
    
    DELIMITER ;
    