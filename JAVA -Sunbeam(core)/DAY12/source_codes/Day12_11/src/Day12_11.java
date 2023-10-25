import java.util.ArrayList;

// we can call clone() on objects only if that object who belongs 
// to class who implements Cloneable

// l1 object belongs to ==> ArrayList class
// ArrayList implements Cloneable
// then only its valid to call clone() on l1 object
// l1.clone() is valid 



public class Day12_11 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(44);
		l1.add(55);
		System.out.println("L1 = "+l1+" L1 hashcode "+l1.hashCode());

		ArrayList<Integer> l2 = (ArrayList<Integer>) l1.clone();   // deep copy 
		System.out.println("L2 = "+l2+" L2 hashcode "+l2.hashCode());
		l1.add(66);
		System.out.println("L1 = "+l1+" L1 hashcode "+l1.hashCode());
		System.out.println("L2 = "+l2+" L2 hashcode "+l2.hashCode());
		
		l2.add(77);
		
		System.out.println("L1 = "+l1+" L1 hashcode "+l1.hashCode());
		System.out.println("L2 = "+l2+" L2 hashcode "+l2.hashCode());
	}


}
