import java.util.LinkedList;

//class Employee is user defined class
// who implements Cloneable
// if any class implements Cloneable then it must implement clone() compulsory


class Employee implements Cloneable
{
	int eid;
	String name;
	Employee()
	{
		this.eid = 0;
		this.name="default";
	}
	Employee(int eid, String name)
	{
		this.eid=eid;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Employee temp = (Employee)super.clone();
		return temp;
		
	}
	
	
	
}
public class Day13_1 {

	public static void main(String[] args)throws CloneNotSupportedException
	{
		LinkedList<Employee> l1 = new LinkedList<Employee>();
		LinkedList<Employee> l2 = new LinkedList<Employee>();
		LinkedList<Employee> l3 = new LinkedList<Employee>();
		Employee e1 = new Employee(123,"Akshita");
		Employee e2 = new Employee(456,"Sparsh");
		Employee e3 = new Employee(789,"Monish");
		Employee e4 = new Employee();
		l1.add(e1);
		l1.add(e2);
	
		System.out.println("L1 = "+l1);
		l2 = l1; //  reference copy
		System.out.println("L2 = "+l2);
		l1.add(e3);
		System.out.println("L1 = "+l1);
		System.out.println("L2 = "+l2);
		
		l3 = (LinkedList<Employee>) l1.clone();
		System.out.println("L3 ="+l3);
		
		e4 = (Employee)e1.clone();
		System.out.println("E4 = "+e4);
		
	}

}
