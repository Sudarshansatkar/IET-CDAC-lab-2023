import java.util.ArrayList;
import java.util.Collections;

public class Day12_7
{
	public static void main(String args[])
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(5);
		l1.add(20);
		l1.add(15);
		l1.add(25);
		System.out.println("List = "+l1);
		Collections.sort(l1);
		System.out.println("Sorted List = "+l1);
		Collections.reverse(l1);
		System.out.println("Reverse List = "+l1);
		
	}
}
