package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee
{
	private double Charges;
	private int hrs;
	
	public ContractEmp() 
	{
		super();
	}
	public ContractEmp(int id) 
	{
		super(id);
	}

	public ContractEmp(int pid, String pname, String mob, String email, String dept, String desg, LocalDate doj,
			double charges, int hrs) {
		super(pid, pname, mob, email, dept, desg, doj);
		Charges = charges;
		this.hrs = hrs;
	}

	public double getCharges() {
		return Charges;
	}

	public void setCharges(double charges) {
		Charges = charges;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	@Override
	public String toString() {
		return "ContractEmp [Charges=" + Charges + ", hrs=" + hrs + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
