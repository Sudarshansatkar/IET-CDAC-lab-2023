// checked VS Unchecked Exception

// If we don't supply command line argument
// ArrayIndexOutOfBoundsException  ==> super class is RuntimeException
// so it comes ===> Unchecked category
// have we handled it at the time of application development??  NO
// if exception occurs then JVM handles it 


public class Day11_5 {

	public static void main(String[] args)
	{
		String str = args[0];
		System.out.println(str);

	}

}
