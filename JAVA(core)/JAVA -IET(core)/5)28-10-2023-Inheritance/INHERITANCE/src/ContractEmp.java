import java.time.LocalDate;

public class ContractEmp extends Employee
{
	private int hrs;
	private double charges;
	
	public ContractEmp()
	{
		
	}

	public ContractEmp(int pid, String pname, String mob, String email, int dept, String desig, LocalDate doj, int hrs,
			double amount) 
	{
		super(pid, pname, mob, email, dept, desig, doj);
		this.hrs = hrs;
		this.charges = charges;
	}

	public int getHrs() 
	{
		return hrs;
	}

	public void setHrs(int hrs) 
	{
		this.hrs = hrs;
	}

	public double getCharges()
	{
		return charges;
	}

	public void setAmount(double amount) 
	{
		this.charges = charges;
	}

	
	public String toString()
	{
		return super.toString() +"ContractEmp [hrs=" + hrs + ", amount=" + charges;
	}
	
	
	
	
	
	

}
