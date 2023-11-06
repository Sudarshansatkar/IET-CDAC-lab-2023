
import java.util.Set;
import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Integer> hs=new HashSet<>();
		boolean ans=hs.add(56);
		System.out.println("Answer: "+ans);
		hs.add(42);
		hs.add(84);
		hs.add(65);
		hs.add(78);
		ans=hs.add(84);
		System.out.println("Answer: "+ans);  //gives false due to duplicate value 
		System.out.println(hs);
		
		Set<String> hs1=new HashSet<>();
		hs1.add("mrng");
		hs1.add("afternon");
		hs1.add("evening");
		hs1.add("night");
		System.out.println(hs1);
		
	}

}
