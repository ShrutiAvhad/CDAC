
DROP FUNCTION IF EXISTS sumSalary;
DELIMITER $

CREATE FUNCTION sumSalary(d int) returns int
deterministic
BEGIN

	DECLARE sum int ;
    SELECT sum(sal) into sum from emp where deptno= d;
    RETURN sum ;
	
END $

DELIMITER ;