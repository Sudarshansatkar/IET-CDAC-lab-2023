package com.demo.test;
import java.util.Scanner;

public class FactRecursion 
{
	
	
	private static int Factorial(int n) 
	{
		if(n<1)
		{
			return 0;
		}
		
		else if(n==1)
		{
			return 1;
		}
		
		else
		{
			int ans=n*Factorial(n-1);
			return ans;
		}	
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		int ans = Factorial(n);
		System.out.println(ans);
	}


}
