import java.util.Scanner;
//static fields
//static methods
// static initializer block
//static reference
//calling static method with the help of classname
// calling non static method with the help of object


class Demo
{
	static int num1;  // static field
	static int num2; // static field
	static Scanner sc; // static reference // field of the class Demo
	//static initializer block
	static
	{
		num1=5;
		num2=5;
		sc=new Scanner(System.in);
	}
	static void accept() //static method
	{
		System.out.println("Enter First number :");
		num1= sc.nextInt();
		System.out.println("Enter Second number :");
		num2=sc.nextInt();
	}
	
	static void disp() //  static method 
	{
		System.out.println("Num1 = "+num1+" Num2 = "+num2);
	}
	
	void m1() // non static method 
	{
		System.out.println("Inside M1 method");
	}
}

public class Day5_7 
{

	public static void main(String[] args) 
	{
		Demo.disp();
		Demo.accept();
		Demo.disp();
		//Demo.m1(); // javac error // m1 is non static method
		Demo d = new Demo();
		d.m1(); // VALID 

	}

}
