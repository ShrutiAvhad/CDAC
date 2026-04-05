DROP PROCEDURE IF EXISTS getQualification;
DELIMITER $

CREATE PROCEDURE getQualification(IN i int)
begin

	IF EXISTS(select 1 from student WHERE ID = i) THEN 
    
		SELECT CONCAT(s.ID," ",s.namefirst," ",s.namelast," ",s.DOB," ",s.emailID," ",q.name," ",q.college," ",q.university)
        AS C
        FROM student AS s JOIN student_qualifications AS q ON s.ID=q.ID WHERE s.ID = i ;
	ELSE 
		select("Student not found");		
    END IF ;
    
end $
delimiter ;