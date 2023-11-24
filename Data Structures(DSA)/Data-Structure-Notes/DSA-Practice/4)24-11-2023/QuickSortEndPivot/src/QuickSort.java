package com.demo.test;

import java.util.Arrays;

public class QuickSort 
{
	static int cnt=0;
	public static void main(String[]args)
	{
		
		int[] arr= {43,56,1,64,12,2,122};
		
		System.out.println("The Given array:");
		System.out.println(Arrays.toString(arr));
		
		quicksort(arr,0,arr.length-1);
		
		System.out.println("Sorted array:");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("No. of passes:"+cnt);
	}

	private static void quicksort(int[] arr, int start, int end)
	{
		cnt++;
		
		if(start<end)
		{
			int p=partition(arr,start,end);
			
			quicksort(arr,start,p-1);  // sorts the left array
			
			quicksort(arr,p+1,end);		//sorts the right array
	
			
		}
		
	}

	private static int partition(int[] arr, int first, int last) 
	{
		int pivot=first;
		int i=first;
		int j=last;
		
		while(i<j)
		{
			
			while(i<last && arr[i]<=arr[pivot])
			{
				i++;
			}
			
			while(j>pivot && arr[j]>arr[pivot])
			{
				j--;
			}
			
			// swap i & j
			if(i<j)
			{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			
		}
		
		int temp=arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		
		return j;
	}
	

}
