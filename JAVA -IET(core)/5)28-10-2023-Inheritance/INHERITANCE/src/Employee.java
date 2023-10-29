
import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person
{
	private int dept;
	private String desig;
	private LocalDate doj;
	
	public Employee()
	{
		
	
	}

	public Employee(int pid, String pname, String mob, String email, int dept, String desig, LocalDate doj) {
		super(pid, pname, mob, email);
		this.dept = dept;
		this.desig = desig;
		this.doj = doj;
	}

	public int getDept()
	{
		return dept;
	}

	public void setDept(int dept)
	{
		this.dept = dept;
	}

	public String getDesig()
	{
		return desig;
	}

	public void setDesig(String desig) 
	{
		this.desig = desig;
	}

	public LocalDate getDoj() 
	{
		return doj;
	}

	public void setDoj(LocalDate doj) 
	{
		this.doj = doj;
	}

	@Override
	public String toString()
	{
		return super.toString()	+" Employee [dept=" + dept + ", desig=" + desig + ", doj=" + doj+"]";
	}



	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
