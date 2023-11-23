package com.demo.test;
import java.util.Arrays;
import java.util.Scanner;



public class InsertionSort
{

	public static void sort(int[] usort)
	{
		int n=usort.length;
		
		for(int i=1; i<n;i++)
		{
			int j=i-1;
			int key=usort[i];
			for(;j>=0 && usort[j]>key;j--)
			{
				usort[j+1]=usort[j];
			}
			
			usort[j+1]=key;
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

