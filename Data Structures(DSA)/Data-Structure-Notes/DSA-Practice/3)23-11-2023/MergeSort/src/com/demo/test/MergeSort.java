package com.demo.test;
import java.util.Arrays;
import java.util.Scanner;



public class MergeSort
{

	public static void mergesort(int[] usort, int start, int end)
	{
		if (start<end)
		{
			int mid=(start+end)/2;
			mergesort(usort,start,mid); //generate left tree
			mergesort(usort,mid+1,end); //generate right iterations
			merge(usort,start,end,mid);
		}
		
		
	}


	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements of array :");
		int num=sc.nextInt();
		int []usort=acceptarr(num);
		mergesort(usort,0,(usort.length-1));
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(usort));
		
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
	
	private static void merge(int[] usort,int start,int end, int mid)
	{
		System.out.println("In merge");
		int i,j,k;
		int n1=mid-start+1;
		int n2=end-mid;
		
		int[] leftarr=new int[n1];
		int[] rightarr=new int[n2];
		
		for(i=0;i<n1;i++)
		{
			leftarr[i]=usort[start+i];
		}
		
		for(i=0;i<n2;i++)
		{
			rightarr[i]=usort[mid+1+i];
		}
		
		i=0;
		j=0;
		k=start;
		
		while(i<n1 && j<n2)
		{
			if(leftarr[i]<rightarr[j])
			{
				usort[k]=leftarr[i];
				i++;
				k++;
			}
			
			else
			{
				usort[k]=rightarr[j];
				j++;
				k++;
			}
		}
		
		while(i<n1)
		{
			usort[k]=leftarr[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			usort[k]=rightarr[j];
			j++;
			k++;
		}
		System.out.println("start :"+start+" end : "+end+" mid :"+mid);
		System.out.println(Arrays.toString(usort));
		
	}

}
