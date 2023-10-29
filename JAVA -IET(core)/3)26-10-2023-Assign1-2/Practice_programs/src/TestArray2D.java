
public class TestArray2D 
{
	public static void main(String[] args)
	{
		int[][]arr=new int[3][3];
		
		ArrayService2D.acceptdata1(arr);
		ArrayService2D.displayData(arr);
		
		int [] ans=ArrayService2D.RowSum(arr);
		System.out.println();
		System.out.println("Rows Sum is");
		ArrayService2D.displayDatasum(ans);

		int [] ans1=ArrayService2D.ColSum(arr);
		System.out.println();
		System.out.println("Column Sum is");
		ArrayService2D.displayDatasum(ans1);
		
	}
}
