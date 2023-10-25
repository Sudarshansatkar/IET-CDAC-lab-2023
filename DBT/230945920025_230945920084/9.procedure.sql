drop procedure if exists pro2;
delimiter $
create procedure pro2()

BEGIN

declare _sal int;
declare c1 cursor for select distinct sal from emp order by sal desc limit 5;
open c1;

S:loop

            fetch c1 into _sal;

            select _sal;

END LOOP S;


close c1;


END $
delimiter ;