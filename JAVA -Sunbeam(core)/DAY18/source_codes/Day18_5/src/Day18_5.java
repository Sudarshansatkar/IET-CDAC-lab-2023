import java.util.Arrays;
import java.util.List;

public class Day18_5 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40);
		int val = 25;
		
		l1.forEach(x -> {
			x  = x+val;
			System.out.print(x+"\t");
		});
	}
}




/*
// lambda with local variable
// add value 10 to each element of l1  
public class Day18_5 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40);
		l1.forEach( x -> {
			int val = 10; //val is local variable of lambda 
			x = x + val;
			System.out.print(x+"\t");
		});
	}
}
*/






/*
//multi line lambda expressions

// take individual element from list and add 2 to each element 

public class Day18_5 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40);
		
		l1.forEach(x -> {
			x = x + 2;
			System.out.print(x+"\t");
		});
		
	}
}

*/


// Single line lambda expression
// (argument) -> {action to be performed / function definition}

/*
public class Day18_5 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40);
		l1.forEach(element -> System.out.print(element+"\t")); //lambda expression
		
	}
}
*/


/*
public class Day18_5 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40);
		System.out.println(l1); // l1.toString()
		System.out.println(); 
		
		for(Integer i : l1)
			System.out.print(i+"\t");
		
		System.out.println();
		
		for(int i=0;i<l1.size();i++)
			System.out.print(l1.get(i)+"\t");
			
		

	}

}
*/