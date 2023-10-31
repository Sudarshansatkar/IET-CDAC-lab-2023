/*
public class AccountType
{

	private String Bname;
	private String Branch;
	private String IFSC;
	private String Address;
	private double minbalance;
	
	public AccountType()
	{
		super();
	}

	public AccountType(String bname, String branch, String iFSC, String address, double minbalance) 
	{
		super();
		this.Bname = bname;
		this.Branch = branch;
		this.IFSC = iFSC;
		this.Address = address;
		this.minbalance = minbalance;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getMinbalance() {
		return minbalance;
	}

	public void setMinbalance(double minbalance) {
		this.minbalance = minbalance;
	}

	@Override
	public String toString() {
		return "Bank [Bname=" + Bname + ", Branch=" + Branch + ", IFSC=" + IFSC + ", Address=" + Address
				+ ", minbalance=" + minbalance + "]";
	}	
}
