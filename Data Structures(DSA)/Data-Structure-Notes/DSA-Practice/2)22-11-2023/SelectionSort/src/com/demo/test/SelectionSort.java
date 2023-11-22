package com.demo.test;
import java.util.Arrays;
import java.util.Scanner;



public class SelectionSort 
{

	public static void sort(int[] usort)
	{
		
		int n=usort.length;
		
		for(int i=0;i<n-1;i++)
		{
			//assume the i th number as the smallest
			int minidx=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(usort[j]<usort[minidx])
				{
					minidx=j;  // put minimun element index in the minidx var
				}
			}
			
			// swap the no. if minimum is found
			
			
			
			
		}
		
		
		
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
