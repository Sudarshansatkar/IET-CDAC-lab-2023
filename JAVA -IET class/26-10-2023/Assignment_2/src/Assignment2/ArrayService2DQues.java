package Assignment2;

import java.util.Scanner;

public class ArrayService2DQues 
{

	public static void Acceptdata(int [][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<a.length;j++)
			{
			System.out.print("Enter "+(i+1)+ "row :"+"\t");
			Scanner sc=new Scanner(System.in);
			a[i][j]=sc.nextInt();
			}
			
		}
		
	}
	
	
	
	public static int[][] AddArray(int[][]a,int[][]b)
	{
		int [][]temp=new int[3][3];
		
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				temp[i][j]=a[i][j]+b[i][j];
			}
		}
		return temp;
		
	}
	
	
	public static void displayData(int [][]a)
	{
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
	public static int[][] transpose1(int [][]a)
	{
		
		int[][]transp=new int[3][3];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
			transp[j][i]=a[i][j];
			}
		}
		
		return transp;
	
	}
	
	
	
	
	

}
