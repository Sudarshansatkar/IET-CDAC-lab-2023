import java.util.Arrays;
import java.util.List;

public class Day18_12 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40);
		l1.forEach( element -> {System.out.print(element +"\t");}); //lambda 
		System.out.println();
		l1.forEach(System.out::println); // More concise 
		

	}

}
