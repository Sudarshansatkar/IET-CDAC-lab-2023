



// Unboxing

public class Day3_3 {

	public static void main(String[] args) 
	{
		String a1 = "40";
		String a2 = "6.5";
		String a3 = "89.54f";
		
		int n1 = Integer.parseInt(a1); //String to int // NP to P // unboxing 
		double d1 = Double.parseDouble(a2); //String to double // NP to P // unboxing
		float f1 = Float.parseFloat(a3);//String to float // NP to P // unboxing
	
		System.out.println("N1 = "+n1+ " D1 = "+d1+ " F1 = "+f1);
	}
}







/*
// Unboxing

public class Day3_3 {

	public static void main(String[] args) 
	{
		String n1 = "25"; // NP Type 
		String n2 = "15"; // NP Type 
		System.out.println(n1+n2);
		//String to int
		int a = Integer.parseInt(n1); // NP to P // Unboxing
		int b = Integer.parseInt(n2); // NP to P   // unboxing
		System.out.println(a+b);
	}
}

*/




/*
public class Day3_3 {

	public static void main(String[] args) 
	{
		String n1 = "123"; // n1 ==> String ==> NP type
		// String to int
		// NP to P ==> Unboxing
		
		int val = Integer.parseInt(n1);
		System.out.println("N1 = "+n1+ " val = "+val);
	}

}
*/