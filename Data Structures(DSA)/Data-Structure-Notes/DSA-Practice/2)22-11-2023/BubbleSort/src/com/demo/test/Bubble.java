package com.demo.test;
import java.util.Arrays;
import java.util.Scanner;



public class Bubble 
{

	public static void sort(int[] usort)
	{
		int temp=0;
		int n=usort.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n-i-1);j++)
			{
				if(usort[j]>usort[j+1])
				{
					temp=usort[j];
					usort[j]=usort[j+1];
					usort[j+1]=temp;
				}
		
			}

		}
		
		System.out.println("Sorted array is:");
		System.out.println(Arrays.toString(usort));
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements of array :");
		int num=sc.nextInt();
		int []usort=acceptarr(num);
		sort(usort);
		
	}

	private static int[] acceptarr(int num)
	{
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[num];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+(i+1)+" element");
			arr[i]=sc.nextInt();
		}
		System.out.println("The provided array is:");
		System.out.println(Arrays.toString(arr));
		return arr;
	}

}
