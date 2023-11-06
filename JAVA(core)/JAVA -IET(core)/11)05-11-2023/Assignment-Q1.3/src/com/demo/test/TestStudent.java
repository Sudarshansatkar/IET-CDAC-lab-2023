package com.demo.test;


import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudent 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		int choice;
		
		do
		{
			System.out.println("1)Add Student \n2)Display all Student \n3)Search by Name \n4)Calculate GPA of a student \n5)Exit \nchoice:");
			choice=sc.nextInt();
			StudentService sservice=new StudentServiceImpl();
			
			switch(choice)
			{
			case 1:
				
				sservice.addStudent();
				
				break;
				
			case 2:
				
				Student[] s1=sservice.Displayall();
			for(Student p1:s1)
			{
				if(p1!=null)
					   System.out.println(p1);
					else
						break;
			}
			
			break;
				
			case 3:
				
				System.out.println("Enter name:");
				String sname=sc.next();
				sservice.searchByName(sname);
				
				
				
				break;
				
			case 4:
				
				
				
				break;
				
			case 5:
				
				
				
				break;
				
			}
			
		}while(choice!=6);
		
	}

}
