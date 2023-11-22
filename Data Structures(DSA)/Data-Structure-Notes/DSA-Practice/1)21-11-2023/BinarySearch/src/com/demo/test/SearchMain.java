package com.demo.test;
import java.util.Scanner;


public class SearchMain
{

	public static void main(String[] args) 
	{
	
		//int []arr=new int[5];
	//	arr[0]=4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element to be searched:");
		int numf=sc.nextInt();
		int pos=Search(numf);
		System.out.println("no. is at position :"+pos);
	
	}
	
	
	public static int Search(int numf)
	{
		int arr[]= {4,7,9,40,150};
		
		int first=0;
		int last= (arr.length)-1;
		// search element 4
		
		int mid=0;
		while(mid!=numf)
		{
			mid=(first+last)/2;
			if(arr[mid]==numf)
			{
				return mid;
			}
			else  
			{
				if(arr[mid]>numf)
				{
					last=mid-1;
				}
				else
				{
					first=mid+1;
				}
			}
		}
		return arr[mid];
	}
}
	//	return mid;
				
		
	


