import java.util.HashSet;
import java.util.LinkedHashSet;

// LinkedHashSet 
//LinkedHashSet : Ordered  , Unsorted , no duplicates , allows null only once 

/*
public class Day14_3 {

	public static void main(String[] args)
	{
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(213);
		lhs.add(345);
		lhs.add(null);
		lhs.add(123);
		lhs.add(789);
		lhs.add(123);
		
		
		for(Integer ele : lhs)
			System.out.print(ele+"\t");
		
	}

}

*/



public class Day14_3 {

	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Java");
		lhs.add("Python");
		lhs.add("MachineLearning");
		lhs.add("Sunbeam");
		lhs.add("Akshita");
		System.out.println("Linked Hash Set Elements are : ");
		for(String ele : lhs)
			System.out.print(ele+"\t");
	}
}

