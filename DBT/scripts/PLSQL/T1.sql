DROP TRIGGER IF EXISTS T1;
DELIMITER $
CREATE TRIGGER T1 after insert on ab for each row 
begin 
	select "Hello World" into @y ;
end $
delimiter ;
    