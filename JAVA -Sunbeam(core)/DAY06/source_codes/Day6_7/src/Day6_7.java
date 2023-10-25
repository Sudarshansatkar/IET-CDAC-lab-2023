import java.util.Arrays;

//toString() vs Arrays.toString()

public class Day6_7 {

	public static void main(String[] args)
	{
		int a1[]= {10,20,30,40};
		System.out.println("A1 = "+a1); //a1.toString() // called from Object class
		System.out.println("Arrays toString = "+Arrays.toString(a1));  // called from Arrays class
	}
}




// calling toString() on various arrays 
/*
public class Day6_7 {

	public static void main(String[] args)
	{
		int a1[]=new int[5]; 
		// array can store P type (int)
		// a1 ==> NP type 
		//int  ==> P
		// Integer ==> NP
		// internally int ==> Integer
		// Integer ===> int implicitly
		//int to Integer ===> done automatically ==> AutoBoxing 
		// Integer to int ===> done automatically ==>AutoUnboxing
		
	
		float a2[]=new float[4];
		byte a3[]=new byte[4];
		
		double a4[]=new double[5];
		
		System.out.println(a1); //a1.toString() //[I@53bd815b 
		System.out.println(a2); // [F@5d22bbb7
		System.out.println(a3); //[B@41a4555e
		System.out.println(a4); //[D@3830f1c0
		

	}

}

*/
