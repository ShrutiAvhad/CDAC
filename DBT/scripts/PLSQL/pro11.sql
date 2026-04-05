DROP PROCEDURE  IF EXISTS pro11;
DELIMITER $

CREATE PROCEDURE pro11()
BEGIN
	DECLARE xen, xs, xdno INT;
    DECLARE xn, xjob VARCHAR(20);
    
    DECLARE c1 cursor for select empno, ename, job, sal, deptno from emp_cur;
    
    declare exit handler for 1329 select "All applicable salaries updated" AS alert;
    
    open c1;
    label1: LOOP
		fetch c1 into xen, xn, xjob, xs, xdno;
        
        IF xdno = 10 THEN
			UPDATE emp_cur SET new_sal = sal + (sal * 15/100) WHERE empno = xen;
		ELSEIF xdno = 20 THEN
			UPDATE emp_cur SET new_sal = sal + (sal * 20/100) WHERE empno = xen;
		ELSEIF xdno = 30 THEN
			UPDATE emp_cur SET new_sal = sal + (sal * 25/100) WHERE empno = xen;
		END IF ;
	END LOOP label1;
    CLOSE c1;
    
END $
DELIMITER ;