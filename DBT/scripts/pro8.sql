drop procedure if exists pro8;
delimiter $
create procedure pro8(IN x int, OUT y int)
begin
	set y = x * x;
end $
delimiter ;