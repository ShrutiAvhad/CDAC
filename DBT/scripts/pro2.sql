drop procedure if exists pro2;
delimiter $ 
create procedure  pro2()
begin
	select "Hello World";
end $
delimiter ;