package com.demo.Service;

import java.util.List;

import com.demo.Beans.Employee;

public interface EmployeeServices {

	void addNewEmp(int ch);

	List<Employee> displayAll();

	boolean deletebyID(int id3);

	boolean modifySalById(int id5, double sal);

	List<Employee> sortByName();

	List<Employee> sortBySalary();

	Employee displayByID(int id1);
	
	List<Employee> sortByDesg();

}
