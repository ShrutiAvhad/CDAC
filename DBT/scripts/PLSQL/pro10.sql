Drop procedure IF Exists pro10;

DELIMITER $
CREATE procedure pro10(IN ideptno INT, in isal int)
begin


select empno, ename, deptno from emp where deptno = ideptno and sal >=isal;

END $
DELIMITER ;