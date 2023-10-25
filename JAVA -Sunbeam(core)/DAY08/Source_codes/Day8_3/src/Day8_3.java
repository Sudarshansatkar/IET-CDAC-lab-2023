import java.util.Scanner;


//Super class 
class Person
{
	String name;
	int age;
	
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
	
	void acceptEmpRecord()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID of employee : ");
		this.eid=sc.nextInt();
		System.out.println("Enter salary : ");
		this.sal=sc.nextInt();
	}
	void dispEmpRecord()
	{
		System.out.println("EID = "+this.eid+" Salary = "+this.sal);
	}
}


public class Day8_3 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.acceptPersonRecord();// valid // not recommended
		e1.acceptEmpRecord();
		e1.dispPersonRecord(); //valid // not recommended 
		e1.dispEmpRecord();
	}

}
