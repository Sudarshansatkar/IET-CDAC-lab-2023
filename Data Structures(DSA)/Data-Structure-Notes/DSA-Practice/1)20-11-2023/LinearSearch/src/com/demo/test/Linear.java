package com.demo.test;
import java.util.Scanner;

public class Linear
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. to be searched by linear search:");
		int numf=sc.nextInt();
		int pos=Search(numf);
		if(pos==-1)
		{
			System.out.println("No. not found");
		}
		else
		{
			System.out.println("No. is at positoion:"+pos);
		}
	}
	
	public static int Search(int numf)
	{
		int arr[]= {8,2,4,7,3,5,9};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==numf)
			{
				return i;
			}

		}
		return -1;
	}

}
