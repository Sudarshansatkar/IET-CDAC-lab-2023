package com.demo.test;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;


public class TestArraylist
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice= new EmployeeServiceImpl();
		int choice=0;
		
		
		do {
		System.out.println("1. Add new Employee\n2.delete employee by id\n3.modify salary\n4.display all");
		System.out.println("5.display by id\n6.Sort by salary\n7.Sort by name\n8.Sort by desg\n9.exit\nchoice: ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("1.Salaried\n2.Contract\n3.Vendor");
			int ch=sc.nextInt();
			eservice.addNewEmployee(ch);
			break;
		
		case 2:
			System.out.println("Enter id for deletion");
			int id=sc.nextInt();
			boolean status=eservice.deletedById(id);
			if(status)
			{
				System.out.println("Deleted Successfully");
			}
			else
			{
				System.out.println("Id not found");
			}
			break;
			
		case 3:
			System.out.println("enter id");
			id=sc.nextInt();
			System.out.println("enter new Salary");
			double salary=sc.nextDouble();
			status=eservice.modifySalary(id,salary);
			break;
			
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			System.out.println("Thank you for visiting!!...");
			break;
		default:
			System.out.println("Wrong choice");
		
		}
		}while(choice!=9);
	}
}
