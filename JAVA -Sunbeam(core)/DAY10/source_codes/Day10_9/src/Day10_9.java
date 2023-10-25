import java.util.Scanner;
public class Day10_9 {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int result;
		Scanner sc = new Scanner(System.in);
		
		try
		{
		
		System.out.println("Enter the first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		num2 = sc.nextInt();
		
		result = num1/num2;
		System.out.println("Num1 = "+num1+" Num2 = "+num2+" Result = "+result);
		
		}
		
		catch(Exception e) // generic catch block
		{
			System.out.println("Exception have occured!!");
		}
		
	}

}


/*

// in this code we handled the exception 
// by writing multiple catch blocks

//can a try block can have multiple catch blocks ?? YES
// BUT RULE is to have generic catch block at the end of all catch blocks
//catch(Exception e)  block must be written after
// all the other catch blocks or else javac error



public class Day10_9 {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int result;
		Scanner sc = new Scanner(System.in);
		
		try
		{
		
		System.out.println("Enter the first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		num2 = sc.nextInt();
		
		result = num1/num2;
		System.out.println("Num1 = "+num1+" Num2 = "+num2+" Result = "+result);
		
		}
		catch(ArithmeticException e)  //Handler 
		{
			System.out.println("Second number can't be zero!");
		}
		catch(Exception e) // generic catch block
		{
			System.out.println("Exception have occured!!");
		}
		
	}

}
*/