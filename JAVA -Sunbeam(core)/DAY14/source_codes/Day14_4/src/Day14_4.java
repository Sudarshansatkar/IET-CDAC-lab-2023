import java.util.TreeSet;

// TreeSet 
//TreeSet : UnOrdered  , Sorted , no duplicates , does not allow null

public class Day14_4 {

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(50);
		ts.add(30);
		ts.add(10);
		ts.add(40);
		ts.add(20);
		ts.add(15);
		ts.add(50);
		//ts.add(null);
		System.out.println("Elements in Tree set are : ");
		for(Integer i : ts)
			System.out.print(i+"\t");

	}

}
