drop procedure if exists Insert1;
delimiter $
create procedure Insert1()

BEGIN

insert into productsDNET values(11,"Cdsd","DD",454);
insert into productsDNET values(1111,"vikram","DD",7812171);
select * from productsDNET;

END $
delimiter ;