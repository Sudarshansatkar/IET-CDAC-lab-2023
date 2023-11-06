package com.demo.beans;

import java.time.LocalDate;

public class Vendor extends Employee
{
	private double Amount;
	private int NoOfemp;
	
	
	public Vendor()
	{
		super();
	}
	public Vendor(int id)
	{
		super(id);
	}


	public Vendor(int pid, String pname, String mob, String email, String dept, String desg, LocalDate doj,
			double amount, int noOfemp) {
		super(pid, pname, mob, email, dept, desg, doj);
		Amount = amount;
		NoOfemp = noOfemp;
	}


	public double getAmount() {
		return Amount;
	}


	public void setAmount(double amount) {
		Amount = amount;
	}


	public int getNoOfemp() {
		return NoOfemp;
	}


	public void setNoOfemp(int noOfemp) {
		NoOfemp = noOfemp;
	}


	@Override
	public String toString() {
		return "Vendor [Amount=" + Amount + ", NoOfemp=" + NoOfemp + ", toString()=" + super.toString() + "]";
	}
	
	

}
