package com.demo.beans;

import java.time.LocalDate;

public class Employee extends Person 
{
	private String dept;
	private String desg;
	private LocalDate doj;
	
	public Employee() 
	{
		super();
	}
	public Employee(int id) 
	{
		super(id);
	}

	public Employee(int pid, String pname, String mob, String email, String dept, String desg, LocalDate doj) {
		super(pid, pname, mob, email);
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", desg=" + desg + ", doj=" + doj + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
