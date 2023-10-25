drop procedure if exists top5Salary;
delimiter $
create procedure top5Salary()
BEGIN
	declare _salary int;
	declare count1 int;
	declare c1 cursor for select distinct sal from emp order by sal desc;
	set count1 = 0;
	open c1;
	drop table if exists top5Salary;
	create table top5Salary (sal int);
	loop1:loop
		set count1 = count1 + 1;
		if count1 <= 5 then
			fetch c1 into _salary;
			insert into top5Salary values (_salary);
		ELSE
			leave loop1;
		end if;
	end loop loop1;
	close c1;
	select * from top5Salary;
end $
delimiter ;
