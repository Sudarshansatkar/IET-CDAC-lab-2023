import java.util.Scanner;

public class ArrayService2D
{
	public static void acceptdata1(int[][]a)
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
	
	public static int[] RowSum(int [][]a)
	{
		int []temp=new int[a[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				temp[i]=temp[i]+a[i][j];
				
			}
		}
		return temp;
		
	}
	
	public static int[] ColSum(int [][]a)
	{
		int []temp=new int[a.length];
		
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				temp[i]=temp[i]+a[j][i];
				
			}
		}
		return temp;
		
	}
	
	public static void displayDatasum(int []a)
	{
		
		for(int i=0; i<a.length;i++)
		{
				System.out.print(a[i]+"\t");
		}
	}

}
