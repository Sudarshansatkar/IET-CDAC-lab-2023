// toString() is not defined inside Employee class
// so it will execute the toString() from Object class

class Employee
{
	private String name;
	private int empid;
	private float salary;
	private int deptid;
	
	public Employee() 
	{
		this.name="DEFAULT";
		this.empid=1;
		this.salary=50000;
		this.deptid=1;
		
	}

	public Employee(String name, int empid, float salary, int deptid) {
		
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.deptid = deptid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	void disp()
	{
		System.out.println("Name = "+this.name+" Empid = "+this.empid+" Dept id = "+this.deptid+" Salary = "+this.salary);
	}
	
	
	
}

/*
public class Day4_12 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("emp1",456,87878,456);
		//e1.disp();
		System.out.println(e1); //Employee@2401f4c3
		// printing e1 object
		// when we print the object of any class
		// automatically toString() gets called  implicitly
	
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
	}

}
*/

public class Day4_12 {

	public static void main(String[] args) 
	{
		Employee e1= new Employee();
		Employee e2=new Employee();
		Employee e3 = e1;
		System.out.println("E1 = "+e1);
		System.out.println("E2 = "+e2);
		System.out.println("E3 = "+e3);
	}
}

	

