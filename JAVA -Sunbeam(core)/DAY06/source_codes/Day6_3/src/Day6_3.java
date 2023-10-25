import java.util.Scanner;
// array and functions

// In this code we have written array and functions
// where we pass name of an array while calling the function

// we pass array name as a reference while giving a call to function
// call by reference concept in java

public class Day6_3 
{
	
	static void accept(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array elements :");
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
	
	}
	
	static void disp(int arr[])
	{
		System.out.println("Array elements are : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
			
	}

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements : ");
		n =sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		
		accept(a);
		accept(b);
		disp(a);
		disp(b);
		
		System.out.println();
		
		for(int i=0;i<c.length;i++)
			c[i]=a[i]+b[i];
		
		disp(c);

	}

}
