import java.util.ArrayList;
import java.util.LinkedList;

public class Day12_12 {

	public static void main(String[] args)
	{
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Sunbeam");
		l1.add("Infotech");
		l1.add("CoreJava");
		l1.add("Python");
		System.out.println("L1 = "+l1);
		l1.addFirst("CDAC");
		System.out.println("L1 = "+l1);
		l1.addLast("C++");
		System.out.println("L1 = "+l1);
		l1.add(1,"PG COURSE");
		System.out.println("L1 = "+l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println("L1 = "+l1);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.addAll(l1);
		System.out.println("A1 = "+a1);
		System.out.println("Contains = "+l1.contains("Sunbeam"));
		
		
	}

}
