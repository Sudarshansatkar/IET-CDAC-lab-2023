
public class Day7_5 {

	public static void main(String[] args) 
	{
		String s1 = new String("Sunbeam"); // NL
		String s2 = new String("Sunbeam"); // NL
		String s3 = "Sunbeam"; // L
		String s4 = new String("Sunbeam").intern(); //NL points to L 
		
		System.out.println("S1 == S2"+(s1==s2));
		System.out.println("S1 == S3 "+(s1==s3));
		System.out.println("S3 == S4 "+(s3==s4));
		System.out.println("S1 equals S2 "+(s1.equals(s2)));
		System.out.println("S1 equals S3 "+(s1.equals(s3)));
		System.out.println("S3 equals S4 "+(s3.equals(s4)));
	}
}



/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		String s1 = new String("Sunbeam"); // NL
		String s2 = "Sunbeam"; // L 
		System.out.println("s1 == s2 "+(s1==s2)); //false
		System.out.println("s1 equals s2 "+(s1.equals(s2))); // true 
	}
}
*/

/*
// == is checking the reference equality
// equals() is checking the contents equality 

public class Day7_5 {

	public static void main(String[] args) 
	{
		String s1 = new String("Sunbeam"); // NL 
		String s2 = new String("Sunbeam"); // NL 
		System.out.println("S1 == S2 "+(s1==s2)); // false 
		System.out.println("S1 equals s2 "+(s1.equals(s2)));// true 
	}
}

*/



/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		String s1 = new String("Sunbeam");
		String s2 = s1; // reference copy
		System.out.println("S1 == S2 "+(s1==s2)); // true 
		System.out.println("S1 equals s2 "+(s1.equals(s2)));// true 
	}
}
*/


/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		String s1= new String("Sunbeam");  // non literal
		// s1 ==> object of type String
		System.out.println(s1); //toString()
		System.out.println(s1.toString());
		

	}

}
*/
