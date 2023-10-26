
public class TestArray
{

	public static void main(String[] args) 
	{
		
		int [] arr=new int[10];
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
	//	int s= ArrayService.findSum(arr);
	//	System.out.println("Sum is :"+s);
		
		
		int val=13;
		int[] arr1=ArrayService.findAllGreaterVal(arr,val);
		ArrayService.displayData(arr1);

	}

}
 