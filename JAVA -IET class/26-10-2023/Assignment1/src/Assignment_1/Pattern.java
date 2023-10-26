package Assignment_1;

import java.util.Scanner;
public class Pattern 
{
	
	public static void diamond()
	{
		System.out.println("Enter the no. of rows to be printed:");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		
		int spacecnt=(int)(row/2);
		
		
		for(int i=1;i<=row;i=i+2)
		{
			//for space
			String s="";
			for(int k=0;k<spacecnt;k++)
			{
				s=s+"_";
			}
			
			spacecnt=spacecnt-1;
			
			//for stars
			String star="";
			for(int j=1;j<=i;j++)
			{
				star=star+"*";
			}
			
			System.out.println(s+star);
		}
		
		//for lower triangle
		spacecnt=1;
		for(int i=row-2;i>=1;i=i-2)
		{
			//for space
			String s="";
			for(int k=0;k<spacecnt;k++)
			{
				s=s+"_";
			}
			
			spacecnt=spacecnt+1;
			
			//for stars
			String star="";
			for(int j=1;j<=i;j++)
			{
				star=star+"*";
			}
			
			System.out.println(s+star);
		}
		
		
	}
	
}

