package Assignment2;

public class ArrayMain {

	public static void main(String[] args) 
	{
		int[][]arr=new int[3][3];
		int[][]brr=new int[3][3];
		
		ArrayService2DQues.Acceptdata(arr);
		ArrayService2DQues.Acceptdata(brr);
		
		int [][]ans=ArrayService2DQues.AddArray(arr,brr);
		ArrayService2DQues.displayData(ans);
		
	}

}
