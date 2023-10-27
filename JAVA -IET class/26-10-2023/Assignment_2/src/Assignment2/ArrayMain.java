package Assignment2;

public class ArrayMain {

	public static void main(String[] args) 
	{
		int[][]arr=new int[3][3];
		int[][]brr=new int[3][3];
		
		System.out.println("Enter 1st array elements:");
		ArrayService2DQues.Acceptdata(arr);
		System.out.println("Enter 2nd array elements:");
		ArrayService2DQues.Acceptdata(brr);
		
		int [][]ans=ArrayService2DQues.AddArray(arr,brr);
		ArrayService2DQues.displayData(ans);
		
		System.out.println("Transpose of array arr is");
		int [][]trans=ArrayService2DQues.transpose1(arr);
		ArrayService2DQues.displayData(trans);
		
	}

}
