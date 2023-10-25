//no guarantee of synchronization
public class Day7_7 {

	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder("CoreJava");
		StringBuilder sb2 = new StringBuilder("CoreJava");
		StringBuilder sb3 = sb2;
		System.out.println("Sb1 == sb2 "+(sb1==sb2)); // false
		System.out.println("Sb1.equals(sb2) "+(sb1.equals(sb2))); //false
		
		System.out.println("Sb2 == sb3 "+(sb2==sb3)); // true
		System.out.println("Sb2.equals(sb3) "+(sb2.equals(sb3))); //true
		
	}

}
