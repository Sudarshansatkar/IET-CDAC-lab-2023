
//String is immutable 
public class Day7_3 {

	public static void main(String[] args)
	{
		String str = "Sunbeam";
		System.out.println("Str = "+str);
		System.out.println(str+" Pune"); // intermediate operation
		System.out.println("Str = "+str); // immutable
		str = str+"Pune";
		System.out.println("Str = "+str);
	}

}