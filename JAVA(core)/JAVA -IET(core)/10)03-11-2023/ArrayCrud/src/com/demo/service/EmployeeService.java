package com.demo.service;

public interface EmployeeService
{
	void addNewEmployee(int ch);

	boolean deletedById(int id);

	boolean modifySalary(int id, double salary);
}
