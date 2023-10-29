
class Date
{
	int dd,mm,yy;

	@Override
	public String toString() 
	{
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
}
class Demo<T>
{
	T obj;
	
	void set(T obj)
	{
		this.obj = obj;
	}
	void disp()
	{
		System.out.println("T = "+this.obj);
	}
}
public class Day10_4 {

	public static void main(String[] args) 
	{
		Demo<Date> d1= new Demo<Date>();
		Date dobj = new Date();
		d1.set(dobj);
		d1.disp();

	}

}
