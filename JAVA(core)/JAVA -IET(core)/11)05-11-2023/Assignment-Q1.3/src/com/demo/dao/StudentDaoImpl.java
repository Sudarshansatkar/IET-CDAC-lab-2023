package com.demo.dao;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao
{
	static int cnt;
	static Student[] sarr=new Student[100];
	
static
{
	sarr[0]=new Student(1,"SKS",55,65,76,8.35f);
	sarr[1]=new Student(2,"CRB",84,65,87,7.7f);
	
	cnt=2;
}

	public void save(Student s)
	{
		sarr[cnt]=s;
		cnt++;
	}
	
	public Student[] findall() 
	{
		return sarr;
	}
	
}
