import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;




public class Day14_6 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"a1");
		hm.put(2, "a2");
		hm.put(3, "a3");
		hm.put(4, "a4");
		
		Set<Map.Entry<Integer,String>> st = hm.entrySet();
		System.out.println("Displaying HashMap contents with for each loop");
		for(Map.Entry<Integer,String> element : st)
		{
			System.out.print(element.getKey()+"\t");
			System.out.print(element.getValue()+"\t");
			System.out.println();
		}
		
	}
}


/*
public class Day14_6 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(11,"emp1");
		hm.put(22, "emp2");
		hm.put(25,"emp3");
		hm.put(13, "emp4");
		hm.put(12, "emp5");
		
		System.out.println("HashMap = "+hm);
		System.out.println("Size = "+hm.size());
		
		Set ks = hm.keySet();
		System.out.println("Keyset = "+ks);
		
		Collection c = hm.values();
		System.out.println("Values = "+c);
		
		Set entry = hm.entrySet();
		System.out.println("Entry = "+entry);
		
		System.out.println("Contains key 25 ?? "+hm.containsKey(25));
		System.out.println("Get the value of  key 25 ? "+hm.get(25));
		hm.remove(12);
		System.out.println("HashMap = "+hm);
				

	}

}

*/