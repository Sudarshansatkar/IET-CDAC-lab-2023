
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

// square of numbers to be printed 

public class Day19_7 {

	public static void main(String[] args) 
	{
		List<Double> list = new ArrayList<Double>();
		
		Collections.addAll(list,1.1,2.2,3.3,4.4,5.5);
		list.stream()
		.map(d -> d * d)
		.forEach(System.out::println);
		
	}
}




/*
public class Day19_7 {

	public static void main(String[] args) 
	{
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		Stream<Integer> s1 = Stream.of(arr); // source
		s1.forEach(i -> System.out.print(i+"\t")); // terminal
		
		//java.lang.IllegalStateException: 
		//stream has already been operated upon or closed
		
		//s1.forEach(val -> System.out.print(val+"\t"));
		
		

	}

}
*/
