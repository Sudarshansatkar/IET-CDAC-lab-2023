package p1;

import java.util.Scanner;

// final keyword ==> constant

//final reference 
//final reference can point to only one memory location
// if we try to modify the final reference then javac error

class Demo
{
	int num1;
	int num2;
	Demo()
	{
		this.num1=5;
		this.num2=5;
	}
	
	void disp()
	{
		System.out.println("Num1 = "+this.num1+" Num2 = "+this.num2);
	}
}

class Day5_4
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.disp();
		Demo d2=new Demo();
		d2.disp();
		Demo d3=d2; // d3 reference // non final reference
		// reference copy
		d3.disp();
		d3=d1;//allowed , d3 is non final 
		System.out.println("D1 = "+d1+" D2 = "+d2+" D3 = "+d3);
		final Demo d4 = d3; // d4 is final reference
		System.out.println("D3 = "+d3+" D4 = "+d4);
		
		// trying to modify final reference
		//d4 = d1; //not allowed //d4 is final // javac error 
		
		
	}
}






/*
//final class and non final class

// final classes can not be extended or can  not be inherited further 
final class Test // final class
{
	
}
class Demo extends Test
{
	
}

public class Day5_4 {

	public static void main(String[] args) 
	{
	}
}


*/






/*
// we can inherit non final classes 
class Person  // non final class 
{
	
}
class Employee extends Person
{
	
}
public class Day5_4 {

	public static void main(String[] args) 
	{
		
	}
}
*/







/*
//final field
class Demo
{
	final float PI=3.14f;  // final field (initialized at the time of declaration)
	int num1; //non final field
	int num2; //non final field 
	
	Demo()
	{
		this.num1=5;
		this.num2=5;
	}
	void disp()
	{
		System.out.println("Num1 = "+num1+" Num2 = "+num2+" PI = "+PI);
	}
}


public class Day5_4 {

	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.disp();
	}
}

*/






/*
// accepting final variable data from user

public class Day5_4 {

	public static void main(String[] args) 
	{
		final int val;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter value ");
		val = sc.nextInt();
		System.out.println("Value = "+val);
		//val++; // javac error 
		
	}
}

*/







/*
//final variable 
public class Day5_4 {

	public static void main(String[] args) 
	{
		final int num = 55; // final variable 
		System.out.println("Num = "+num);
		//num+=10; // can not modify final variable 
		//System.out.println("Num = "+num);
		final float PI = 3.14f;
		System.out.println("PI = "+PI);
		//PI++; // compile time error // javac  error 
		
	}

}
*/
