import java.time.LocalDate;

public class Member extends Person
{
	private String typeOfMembership;
	private double cost;
	public Member()
	{
		
	}
	public Member(int pid, String pname, String mob, String email, String typeOfMembership, double cost)
	{
		super(pid, pname, mob, email);
		this.typeOfMembership = typeOfMembership;
		this.cost = cost;
	}
	public String getTypeOfMembership()
	{
		return typeOfMembership;
	}
	public void setTypeOfMembership(String typeOfMembership) 
	{
		this.typeOfMembership = typeOfMembership;
	}
	public double getCost() 
	{
		return cost;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public String toString() {
		return super.toString()+" Member [typeOfMembership=" + typeOfMembership + ", cost=" + cost+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
