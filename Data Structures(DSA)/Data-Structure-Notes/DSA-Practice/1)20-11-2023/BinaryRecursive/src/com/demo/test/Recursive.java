package com.demo.test;
import java.util.Scanner;
public class Recursive
{
	
	public static int[]acceptArr()
	{	
		
		System.out.println("Enter the no. of elements in array:");
		Scanner sc=new Scanner(System.in);
		int numt=sc.nextInt();
		int temp[]=new int[numt];
		for(int i=0;i<numt;i++)
		{
			System.out.println("Enter "+(i+1)+" element:");
			int a=sc.nextInt();
			temp[i]=a;
		}
		return temp;
	}
	
	public static int binarySearchRecursive(int first, int last, int search, int[] arr)
	{
		
		int mid=(first+last)/2;
		
		if(arr[mid]==search)
		{
			System.out.println(first+" "+last+" "+arr[mid]+" "+search);
			return mid;
		}
		
		else
		{
			if(arr[mid]>search)
			{
				System.out.println(first+" "+last+" "+arr[mid]+" "+search);
				return binarySearchRecursive(first,mid-1,search,arr);
			}
			else
			{
				System.out.println(first+" "+last+" "+arr[mid]+" "+search);
				return binarySearchRecursive(mid+1,last,search,arr);
			}
		}
		
	
	}
	
	
	public static void main(String[] args) 
	{
		int []arr=acceptArr();
		
	//	System.out.println(arr[1]);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be searched:");
		int x=sc.nextInt();
		int first=0;
		int last = arr.length-1;
		int pos=binarySearchRecursive(first,last,x,arr);
		System.out.println("Searched element is at pos:"+pos);
	}

	


	
}
