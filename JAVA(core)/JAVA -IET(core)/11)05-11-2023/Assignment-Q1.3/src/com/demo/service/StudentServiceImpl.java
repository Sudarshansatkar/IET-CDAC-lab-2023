package com.demo.service;

import java.util.Scanner;
import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService
{
	
	private StudentDao sdao;
	public StudentServiceImpl()
	{
		sdao=new StudentDaoImpl();
	}
	
	public void addStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int sid=sc.nextInt();
		System.out.println("Enter Student Name:");
		String sname=sc.next();
		System.out.println("Enter 3 Marks of Student:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		System.out.println("Enter GPA:");
		float gpa=sc.nextFloat();
		Student s=new Student(sid,sname,m1,m2,m3,gpa);
		
		sdao.save(s);

	}

	public Student[] Displayall()
	{
		return sdao.findall();

	}

	@Override
	public Student searchByName(String sname) 
	{
		return sdao.findByName(sname);
	}

	@Override
	public float calculateGPA(int id) 
	{
		return sdao.getGPA(id);
	}


}
