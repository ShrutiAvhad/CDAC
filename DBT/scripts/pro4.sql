drop procedure if exists pro4;
delimiter $
create procedure pro4(IN x int)
begin
	if x >= 10 THEN
	select 'good';
	ELSE
	select 'bad';
	end if;
end $
delimiter ;