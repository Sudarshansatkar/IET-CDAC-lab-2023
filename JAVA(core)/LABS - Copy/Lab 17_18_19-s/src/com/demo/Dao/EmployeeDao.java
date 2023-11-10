package com.demo.Dao;

import java.util.List;

import com.demo.Beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	List<Employee> showall();

	Employee findById(int id1);

	List<Employee> sortName();

	boolean remove(int id3);

	boolean modifySal(int id5, double sal);

	List<Employee> sortSalary();

	List<Employee> sortDesg();

}
