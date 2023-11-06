package com.demo.service;
import java.util.Scanner;

import com.demo.beans.Student;
public interface StudentService
{

	public void addStudent();

	Student[] Displayall();

	public void searchByName(String sname);
	
}
