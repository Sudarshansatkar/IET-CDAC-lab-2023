package com.demo.model;

public class Customer 
{
	private String cid;
	private String bpack;
	private String oppack;
	
	public Customer() {
		super();
	}

	public Customer(String cid, String bpack, String oppack) {
		super();
		this.cid = cid;
		this.bpack = bpack;
		this.oppack = oppack;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getBpack() {
		return bpack;
	}

	public void setBpack(String bpack) {
		this.bpack = bpack;
	}

	public String getOppack() {
		return oppack;
	}

	public void setOppack(String oppack) {
		this.oppack = oppack;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", bpack=" + bpack + ", oppack=" + oppack + "]";
	}
	
	

	

}
