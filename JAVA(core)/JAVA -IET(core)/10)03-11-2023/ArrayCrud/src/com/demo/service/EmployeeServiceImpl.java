package com.demo.service;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.ContractEmp;
import com.demo.beans.Vendor;


public class EmployeeServiceImpl implements EmployeeService 
{
	private EmployeeDao edao;
	
	public EmployeeServiceImpl()
	{
		edao=new EmployeeDaoImpl();
	}
	
	public void addNewEmployee(int ch)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter pid");
			int pid=sc.nextInt();
			System.out.println("enter name");
			String nm=sc.next();
			System.out.println("enter mobile");
			String mob=sc.next();
			System.out.println("enter email");
			String em=sc.next();
			System.out.println("enter dept");
			String dept=sc.next();
			System.out.println("enter desg");
			String desg=sc.next();
			System.out.println("enter date of joining(dd/MM/yyyy)");
			String dt=sc.next();
			LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			Employee e=null;
			if(ch==1)
			{
				System.out.println("enter salary");
				double s=sc.nextDouble();
				System.out.println("enter bonus");
				double b=sc.nextDouble();
				e=new SalariedEmp(pid, nm, mob, em, dept, desg, ldt, s, b);
			}
			else if (ch==2)
			{
				System.out.println("enter Hrs");
				int hrs=sc.nextInt();
				System.out.println("enter charges per hour");
				double charges=sc.nextDouble();
				e=new ContractEmp(pid, nm, mob, em, dept, desg, ldt, charges,hrs);
			}
			else if(ch==3)
			{
				System.out.println("enter amount");
				double amount=sc.nextDouble();
				System.out.println("enter no. of Employees");
				int noOfEmp=sc.nextInt();
				e=new Vendor(pid, nm, mob, em, dept, desg, ldt, amount, noOfEmp);
			}
			edao.save(e);
	}

	@Override
	public boolean deletedById(int id) {
		return edao.removeById(id);
	}
}
