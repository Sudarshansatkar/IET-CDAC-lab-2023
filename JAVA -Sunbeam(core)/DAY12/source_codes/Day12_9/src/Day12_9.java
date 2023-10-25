import java.util.ArrayList;

//if any interface is not having its method declaration
// then that interface is called as MARKER INTERFACE
// ArrayList  implements RandomAccess 
// which is marker interface
// it means ArrayList allows accessibility of elements in random way that too in faster way


public class Day12_9 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(44);
		l1.add(55);
		System.out.println("L1 = "+l1);
		
		System.out.println("fetch the element at 3rd location "+l1.get(3));

	}

}
