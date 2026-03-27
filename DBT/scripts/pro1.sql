drop procedure if exists pro1;
delimiter $
create procedure pro1()
begin 
	declare x int default 100;
	declare y int default 200;
	select x + y;
end $
delimiter ;




