
// unchecked exception can be handled through try-catch (Recommended)
// or can be handled through throws keyword JVM handles it


public class Day11_9 {

	public static void main(String[] args) throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
			int result = 30/6;
			System.out.println("Result = "+result);
		
			int data[]= {10,20,30,40,50};
			System.out.println("data[2] = "+data[9]);
		
			
	}

}



/*
public class Day11_9 {

	public static void main(String[] args) 
	{
		try
		{
			int result = 30/5;
			System.out.println("Result = "+result);
		
			int data[]= {10,20,30,40,50};
			System.out.println("data[2] = "+data[2]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occured");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index out of bound");
		}
	}

}

*/