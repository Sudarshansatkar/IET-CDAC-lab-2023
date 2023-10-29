
public class Student 
{
	//private data members
	private int sid;
	private String sname;
	private int m1,m2,m3;
	
	//default constructor 
	public Student()
	{
		sid=0;
		sname=null;
		m1=0;
		m2=0;
		m3=0;	
	}
	
	//parametrized constructor
	
	public Student(int sid,String sname,int m1,int m2,int m3)
	{
		this.sid=sid;
		this.sname=sname;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	
	public void setsid(int sid)
	{
		this.sid=sid;
	}
	
	public int getsid()
	{
		return this.sid;
	}
	
	public void setsname(String sname)
	{
		this.sname=sname;
	}
	
	public String getname()
	{
		return this.sname;
	}
	
	public void setm1(int m1)
	{
		this.m1=m1;
	}
	
	public int getm1()
	{
		return this.m1;
	}
	
	public void setm2(int m2)
	{
		this.m2=m2;
	}
	
	public int getm2()
	{
		return this.m2;
	}
	
	public void setm3(int m3)
	{
		this.m3=m3;
	}
	
	public int getm3()
	{
		return this.m3;
	}
	
	
	
	public String toString()
	{
		return "sid : "+this.sid+" \nName: "+this.sname+"\nm1 :"+this.m1+ "\nm2:"+this.m2+"\nm3 :"+this.m3;		
	}
}
