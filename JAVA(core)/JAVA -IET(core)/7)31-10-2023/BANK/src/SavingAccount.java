import java.time.LocalDate;

public class SavingAccount extends BankAccount

{
	
	private double interest;

	public SavingAccount() 
	{
	
	}

	public SavingAccount(String bname, String branch, String iFSC, String address, double minbalance, String name,
			String mob, String email, LocalDate dateopen, double currbalance, int pin, double interest) 
	{
		super(bname, branch, iFSC, address, minbalance, name, mob, email, dateopen, currbalance, pin);
		
		this.interest = interest;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "SavingAccount [interest=" + interest + ", toString()=" + super.toString() + "]";
	}
	
}



	
	
	
