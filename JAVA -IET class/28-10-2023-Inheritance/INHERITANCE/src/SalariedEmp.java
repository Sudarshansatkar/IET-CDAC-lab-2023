import java.time.LocalDate;

public class SalariedEmp extends Employee
{
	private double sal;
	private double bonus;
	public SalariedEmp() 
	{
	
	}
	public SalariedEmp(int pid, String pname, String mob, String email, int dept, String desig, LocalDate doj,
			double sal, double bonus) 
	{
		super(pid, pname, mob, email, dept, desig, doj);
		this.sal = sal;
		this.bonus = bonus;
	}
	public double getSal() 
	{
		return sal;
	}
	public void setSal(double sal) 
	{
		this.sal = sal;
	}
	public double getBonus() 
	{
		return bonus;
	}
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	@Override
	public String toString()
	{
		return super.toString()+"SalariedEmp [sal=" + sal + ", bonus=" + bonus;
	}
	
	
	
	
	
	
	
	
}
