package com.demo.beans;

public class Student
{
	private int studid;
	private String name;
	private int m1,m2,m3;
	private float gpa;
	public Student() 
	{
	
	}
	public Student(int studid, String name, int m1, int m2, int m3,float gpa)
	{
		super();
		this.studid = studid;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.gpa=gpa;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	
	public float calculateGPA(int m1,int m2, int m3)
	{
		return gpa=(float)1/3*m1+(float)1/2*m2+(float)1/4*m3;
	}
	
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", gpa="
				+ gpa + "]";
	}
}


