drop procedure if exists pro9;
delimiter $
create procedure pro1()
begin
	declare x int default 0;
	lbl1:loop
	set x = x + 1;
	select x;
	if x = 10 then 
		leave lbl1;	
	end if;
	end loop lbl1;
end $
delimiter ;