package com.demo.test;
import java.util.Scanner;

public class AddR
{
	
	private static int add(int num)
	{
		if(num<1)
		{
			return 0;
		}
		else if(num==1)
		{
			return 1;
		}
		else
		{
			int ans=num+add(num-1);
			System.out.println(ans);
		    return ans;
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many numbers to be added: ");
		int num=sc.nextInt();
		add(num);
	}

	
	
}
