package com.demo.dao;

import com.demo.beans.Student;

public interface StudentDao 
{
	public void save(Student s);
	
	public Student[] findall();
	
	Student findByName(String sname);

	public float getGPA(int id);
	
	
	
}
