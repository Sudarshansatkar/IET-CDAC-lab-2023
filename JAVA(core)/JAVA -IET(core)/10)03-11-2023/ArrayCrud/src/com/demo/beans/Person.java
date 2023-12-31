package com.demo.beans;

public class Person 
{
	private int pid;
	private String pname;
	private String mob;
	private String email;
	
	public Person()
	{
		super();	
	}
	public Person(int id)
	{
		this.pid=id;	
	}

	public Person(int pid, String pname, String mob, String email) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mob = mob;
		this.email = email;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mob=" + mob + ", email=" + email + "]";
	}
	
	
	

}
