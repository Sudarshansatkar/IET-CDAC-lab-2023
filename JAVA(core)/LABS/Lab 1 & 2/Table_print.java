package Assignment_1;

import java.util.Scanner;

public class Table_print
{ 
	public static void Print()
	{
	System.out.println("Enter a no. whose table is to be printed:");
	Scanner cc=new Scanner(System.in);
	
	int num1=cc.nextInt();
	
	for(int i=1; i<=10;i++)
	{
		
		System.out.println(num1 + "*" + i+"=" +(i*num1));
	}
	
	}
}