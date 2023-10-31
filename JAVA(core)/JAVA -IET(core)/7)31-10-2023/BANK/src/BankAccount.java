import java.time.LocalDate;

public class BankAccount 

{
	private String Bname;
	private String Branch;
	private String IFSC;
	private String address;
	private double minbalance;
	private String name;
	private String mob;
	private String email;
	private LocalDate dateopen;
	private double currbalance;
	private int pin;
	
	public BankAccount() 
	{
	}

	public BankAccount(String bname, String branch, String iFSC, String address, double minbalance, String name,
			String mob, String email, LocalDate dateopen, double currbalance, int pin)
	{
		super();
		Bname = bname;
		Branch = branch;
		IFSC = iFSC;
		address = address;
		this.minbalance = minbalance;
		this.name = name;
		this.mob = mob;
		this.email = email;
		this.dateopen = dateopen;
		this.currbalance = currbalance;
		this.pin = pin;
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
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMinbalance() {
		return minbalance;
	}

	public void setMinbalance(double minbalance) {
		this.minbalance = minbalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public LocalDate getDateopen() {
		return dateopen;
	}

	public void setDateopen(LocalDate dateopen) {
		this.dateopen = dateopen;
	}

	public double getCurrbalance() {
		return currbalance;
	}

	public void setCurrbalance(double currbalance) {
		this.currbalance = currbalance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "BankAccount [Bname=" + Bname + ", Branch=" + Branch + ", IFSC=" + IFSC + ", address=" + address
				+ ", minbalance=" + minbalance + ", name=" + name + ", mob=" + mob + ", email=" + email + ", dateopen="
				+ dateopen + ", currbalance=" + currbalance + ", pin=" + pin + "]";
	}


	}
	

	
	