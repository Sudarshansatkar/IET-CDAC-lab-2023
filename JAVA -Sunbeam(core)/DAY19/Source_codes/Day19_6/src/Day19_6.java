import java.util.stream.Stream;

// Streams
// array data take data in stream1 (source)
// find even numbers and store stream2 (intermediate)
// map each number with word "SUNBEAM"(intermediate)
// Perform the operation to convert letters in  small letters (intermediate)
// print the stream (terminal)

public class Day19_6 {

	public static void main(String[] args) 
	{
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		Stream.of(arr)
		.filter(i -> i%2 ==0)
		.map(i -> "SUNBEAM "+i)
		.map(i -> i.toLowerCase())
		.forEach(i -> System.out.print(i+"\t"));
	}
}


/*
public class Day19_6 {

	public static void main(String[] args) 
	{
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		// create a stream of data (source)
		Stream<Integer> s1 = Stream.of(arr);
		//System.out.println(s1); //ReferencePipeline$Head@65ae6ba4
		
		//s1.forEach(System.out::println);
		//s1.forEach(x -> System.out.println(x));
		
		// filter is intermediate operation 
		Stream<Integer> s2 = s1.filter(i -> i%2 == 0);
		//System.out.println(s2);
		//s2.forEach(x -> System.out.println(x));
		
		
		Stream<String> s3 = s2.map(i -> " SUNBEAM "+i);
		//System.out.println(s3);
		//s3.forEach(x -> System.out.println(x));
		
		Stream<String> s4 = s3.map(i -> i.toLowerCase());
		//System.out.println(s4);
		
		s4.forEach(x -> System.out.println(x)); // Terminal function
		
		
	}

}

*/
