import java.util.Arrays;

// 2D Array


public class Day6_10 {

	public static void main(String[] args) 
	{
		int[][] a1 = new int[][] {{10,20,30},{11,22,33},{99,88,77}}; 
		
		for(int[] arr : a1) // this will iterate in each row and each row is itself an array 
		{
			for(int ele : arr) // this will iterate in each column inside each row 
				System.out.print(ele+"\t");
			System.out.println();
		}
	}
}


/*
public class Day6_10 {

	public static void main(String[] args) 
	{
		int[][] a1 = new int[][] {{10,20,30},{11,22,33},{99,88,77}}; 
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(a1[i][j]+"\t");
			System.out.println();
		}
	}
}
*/



/*
public class Day6_10 {

	public static void main(String[] args) 
	{
		int[][] a1 = new int[][] {{10,20,30},{11,22,33},{99,88,77}}; 
		System.out.println("A1 = "+a1.length);
		System.out.println("a1[0] = "+a1[0]+" Length a1[0] = "+a1[0].length);
		System.out.println("a1[1] = "+a1[1]+" Length a1[1] = "+a1[1].length);
		System.out.println("a1[2] = "+a1[2]+" Length a1[2] = "+a1[2].length);
		System.out.println(Arrays.toString(a1[0]));
		System.out.println(Arrays.toString(a1[1]));
		System.out.println(Arrays.toString(a1[2]));
		
		
	}
}
*/


/*
public class Day6_10 {

	public static void main(String[] args) 
	{
		int[][] a1 = new int[3][3]; //valid 
		int a2[][]=new int[4][4]; //valid
		int a3[][]= new int[][] {{4,5,6},{7,8,9}}; // valid
		int a4[][]= {{1,2,3},{4,5,6},{7,8,9}}; //valid
		//int a5[][]= new int[3][2]{{1,2},{3,4},{5,6}}; // Invalid 
		

	}

}
*/