drop procedure if exists pro6;
delimiter $
create procedure pro6(IN x int, IN y varchar(20))
begin 
	insert into dept(deptno,dname) values(x,y);
	select 'insert';
end $
delimiter ;