drop procedure if exists pro5;
delimiter $
create procedure pro1(IN x int)
begin
	declare flag bool default false;
	select true into flag from emp where empno = x;
	if flag then 
		select empno,ename,sal from emp where empno = x;
	ELSE
		select "Not found" as "Message Box";
	end if;
end $
delimiter ;