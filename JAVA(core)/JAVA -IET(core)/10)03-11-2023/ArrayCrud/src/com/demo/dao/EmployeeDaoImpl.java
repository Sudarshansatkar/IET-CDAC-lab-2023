package com.demo.dao;

import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.Vendor;
import com.demo.beans.ContractEmp;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class EmployeeDaoImpl implements EmployeeDao 
{
	static List<Employee>elist;
	static
	{
		elist=new ArrayList<>();
		elist.add(new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		elist.add(new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		elist.add(new ContractEmp(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		elist.add(new ContractEmp(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		elist.add(new Vendor(16,"Mohit","888","mohit@gmail.com","admin","associate",LocalDate.of(2001, 9,10),50000,15));
 		elist.add(new Vendor(17,"Megha","999","megha@gmail.com","hr","associate",LocalDate.of(2003, 12,22),40000,20));
	}
	
	public void save(Employee e)
	{
		elist.add(e);
	}

	@Override
	public boolean removeById(int id)
	{
		return elist.remove(new SalariedEmp(id));
	}
	
}
