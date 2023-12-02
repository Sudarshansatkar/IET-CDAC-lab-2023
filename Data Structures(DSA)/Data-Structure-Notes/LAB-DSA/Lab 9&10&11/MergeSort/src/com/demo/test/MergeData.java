package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class MergeData

{

	
	public static int[] MergeData(int[]arr1,int[]arr2, int[]arr3)
	{
		int i=0,k=0,j=0;
		
		while( i<arr1.length && j<arr2.length)
		{
			
			if(arr1[i]<arr2[j])
			{
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			
			else
				
			{
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<arr1.length)
		{
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length)
		{
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		
		return arr3;
		
	}
	
	
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements 1st array:");
		int a1=sc.nextInt();
		int arr1[]=acceptarr(a1);
		
		System.out.println("Enter the no. of elements 2nd array:");
		int a2=sc.nextInt();
		int arr2[]=acceptarr(a2);
		System.out.println("Below two arrays are merged:");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int arr3[]=new int[arr1.length+arr2.length];
		
		int sort[]=MergeData(arr1,arr2,arr3);
		
		System.out.println("Merged array is:");
		System.out.println(Arrays.toString(arr3));
	}
	
	private static int[] acceptarr(int num)
	{
		System.out.println("Enter a sorted array:");
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
