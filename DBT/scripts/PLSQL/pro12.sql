DROP PROCEDURE IF EXISTS addUser;
DELIMITER $
CREATE PROCEDURE addUser(u varchar(50), p varchar(50), e varchar(50))
begin
	insert into login(username, password, emailID)
    values(u, p, e);
end $

DELIMITER ;
