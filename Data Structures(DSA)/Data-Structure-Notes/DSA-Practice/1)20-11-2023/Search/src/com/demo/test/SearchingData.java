package com.demo.test;
import java.util.Scanner;

public class SearchingData {

	private static void acceptdata(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter number: "+(i+1));
			arr[i]=sc.nextInt();	
		}
		
	}

	private static int linearSearch(int[] arr, int search) {
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]==search)
				return j;
		}
		return -1;
	}
	

	private static int binarySearch(int[] arr, int search) {
		int first=0, last = arr.length-1;
		{
			while(first<=last) {
			int mid=(first+last)/2;
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(arr[mid]<search)
			{
				first= mid+1;
			}
			else 
			{
				last=mid-1;
			}
		}
		}	
		return -1;
			
	}




	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		acceptdata(arr);
		
		System.out.println("Enter number for search");
		int search=sc.nextInt();
		
//		int pos=linearSearch(arr,search);
//		System.out.println("number is at: "+pos);
		
		int pos1=binarySearch(arr,search);
		if(pos1!=-1) {
			System.out.println("Number found at: "+pos1);
		}
		else {
			System.out.println("number not found");
		}
	}


}
