import java.util.Scanner;
// calling parameterized constructor 
//from sub class

// parameterless constructor of super class gets called automatically 
// from parameterless constructor of sub class

// If we wish to call parameterized constructor of super class
// from parameterized constructor of sub class
// it is necessary to use super(along with parameters) in 
//sub class constructor body
//RULE: super must be written as the first statement always

class Person
{
	String name;
	int age;
	Person() // parameterless constructor 
	{
		super();
	}
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void acceptPersonRecord()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name of person : ");
		this.name=sc.next();
		System.out.println("Enter Age : ");
		this.age=sc.nextInt();
	}
	void dispPersonRecord()
	{
		System.out.println("Name = "+this.name+" Age = "+this.age);
	}
}
// Employee is-a Person
// Employee is sub class
class Employee extends Person
{
	int eid;
	float sal;
	
	Employee()
	{
		super();
	}
	Employee(String name,int age,int eid,float sal)
	{
		super(name,age);
		this.eid=eid;
		this.sal=sal;
	}
	
	void acceptEmpRecord()
	{
		//super.acceptPersonRecord(); // method is called directly from super class 
		acceptPersonRecord();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID of employee : ");
		this.eid=sc.nextInt();
		System.out.println("Enter salary : ");
		this.sal=sc.nextInt();
	}
	void dispEmpRecord()
	{
		//super.dispPersonRecord(); // calling super class method 
		dispPersonRecord();
		System.out.println("EID = "+this.eid+" Salary = "+this.sal);
	}
}


public class Day8_6 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("emp1",27,123,99999);
		e1.dispEmpRecord();
	}

}
