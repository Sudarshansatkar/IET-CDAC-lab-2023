import java.time.LocalDate;

public class Vendor extends Employee
{
	private int no_ofEmp;
	private double amount;
	public Vendor()
	{
		
	}
	public Vendor(int pid, String pname, String mob, String email, int dept, String desig, LocalDate doj, int no_ofEmp,
			double amount) 
	{
		super(pid, pname, mob, email, dept, desig, doj);
		this.no_ofEmp = no_ofEmp;
		this.amount = amount;
	}
	public int getNo_ofEmp() {
		return no_ofEmp;
	}
	public void setNo_ofEmp(int no_ofEmp) {
		this.no_ofEmp = no_ofEmp;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String toString()
	{
		return super.toString()+"Vendor [no_ofEmp=" + no_ofEmp + ", amount=" + amount+"]";
	}
	
	
	
	
}
