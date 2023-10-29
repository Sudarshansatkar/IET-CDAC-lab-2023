
public class Person
{
	
	private int pid;
	private String pname,mob,email;
	
	public Person()
	{
		
	}
	
	public Person(int pid,String pname,String mob,String email)
	{
		this.pid=pid;
		this.pname=pname;
		this.mob=mob;
		this.email=email;
	}
	
	public void setpid(int pid)
	{
		this.pid=pid;
	}
	
	public void setpname(String pname)
	{
		this.pname=pname;
	}
	
	public void setmob(String mob)
	{
		this.mob=mob;
	}
	
	public void setemail(String email)
	{
		this.email=email;
	}
	
	public int getpid()
	{
		return this.pid;
	}
	
	public String getpname()
	{
		return this.pname;
	}
	
	public String getmob()
	{
		return this.mob;
	}
	
	public String getemail()
	{
		return this.email;
	}
	
	
	public String toString()
	{
		return "id:"+ this.pid + " Name:"+pname+ " Mob:"+this.mob+ " Email:" +this.email;
	}
	

}
