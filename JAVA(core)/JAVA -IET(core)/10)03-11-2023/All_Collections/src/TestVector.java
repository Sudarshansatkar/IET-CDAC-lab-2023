import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector ();  //creating an empty array
		v.add(45);
		v.add(85);
		v.add(32);
		v.add(96);
		v.add(41);
		System.out.println(v);
		
		System.out.println("Capacity: "+v.capacity());  //by default capacity of vector is 10.
		System.out.println("Size: "+v.size());  //size means actual elements present in vector.
		
		int s=0;
		for(Integer num:v)
		{
			s=s+num;
		}
		System.out.println("Addition: "+s);
		System.out.println(v.clone()); //make a copy of existing vector
		System.out.println(v.contains(41));  //gives true if given number is exists otherwise gives false
		v.add(5, 25);   //adds number at given index.
		System.out.println(v);
		v.add(3, 23);   
		System.out.println(v);
		System.out.println(v.firstElement());  //gives first element of vector
		System.out.println(v.lastElement());  //gives last element of vector
		

	}

}
