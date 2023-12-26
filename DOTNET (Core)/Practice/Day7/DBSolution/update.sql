drop procedure if exists update1;
delimiter $
create procedure update1()

BEGIN

select * from productsDNET;

END $
delimiter ;