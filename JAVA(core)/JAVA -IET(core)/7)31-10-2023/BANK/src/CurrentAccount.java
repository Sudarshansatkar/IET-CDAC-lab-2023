import java.time.LocalDate;

public class CurrentAccount extends BankAccount
{
	
	private double credditcash;

	public CurrentAccount() 
	{
	}

	public CurrentAccount(String bname, String branch, String iFSC, String address, double minbalance, String name,
			String mob, String email, LocalDate dateopen, double currbalance, int pin, double credditcash)
	{
		super(bname, branch, iFSC, address, minbalance, name, mob, email, dateopen, currbalance, pin);
		
		this.credditcash = credditcash;
	}

	public double getCredditcash() {
		return credditcash;
	}

	public void setCredditcash(double credditcash) {
		this.credditcash = credditcash;
	}

	@Override
	public String toString()
	{
		return "CurrentAccount [credditcash=" + credditcash + ", toString()=" + super.toString() + "]";
	}

}
	
	
