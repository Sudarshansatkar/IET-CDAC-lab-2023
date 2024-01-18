package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MyUser84")
public class MyUser1 
{
	
	@Id
	private int uid;
	
	private String uname;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="addrid")
	
	private Address1 addr;

	public MyUser1()
	{
		super();
	}

	public MyUser1(int uid, String uname, Address1 addr)
	{
		super();
		this.uid = uid;
		this.uname = uname;
		this.addr = addr;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Address1 getAddr() {
		return addr;
	}

	public void setAddr(Address1 addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "MyUser1 [uid=" + uid + ", uname=" + uname + ", addr=" + addr + "]";
	}
	
	
	
	
	
	
	
	
	

}
