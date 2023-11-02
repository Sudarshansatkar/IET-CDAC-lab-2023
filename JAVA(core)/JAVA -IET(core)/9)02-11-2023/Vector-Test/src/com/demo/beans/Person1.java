package com.demo.beans;

public class Person1 
{
	private int pid;
	private String mob;
	private String pname;
	public Person1() 
	{
		pid=0;
		mob=null;
		pname=null;
	}
	public Person1(int pid, String mob, String pname) 
	{
		super();
		this.pid = pid;
		this.mob = mob;
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	@Override
	public String toString() {
		return "Person1 [pid=" + pid + ", mob=" + mob + ", pname=" + pname + "]";
	}
	
}
	
	
	
	
	



