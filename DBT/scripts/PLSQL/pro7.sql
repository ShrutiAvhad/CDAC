drop procedure if exists pro7;
delimiter $
create procedure pro1()
begin 
	declare x int default 0;
	loop
	set x = x + 1;
	select x;
	end loop;
end $
delimiter ;