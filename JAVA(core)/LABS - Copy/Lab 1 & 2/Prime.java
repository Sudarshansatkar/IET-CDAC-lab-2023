package Assignment_1;

import java.util.Scanner;
public class Prime
{

	public static void PrimeCal() 
	{
	System.out.println("Enter a number: ");
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int i=2;
	
	while(i<num1)
	{
		if(num1%i==0)
			break;
			i++;
	}
	if(i==num1)
	{
		System.out.println("number is Prime");
	}
	else
	{
		System.out.println("Number is not prime");
	}
	
}
}
