import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Day13_9 {

	public static void main(String[] args)
	{
		
		ArrayDeque<String> q = new ArrayDeque<String>();
		q.offer("Sunbeam");
		q.offer("CoreJava");
		q.offer("Python");
		q.offer("C++");
		
		System.out.println("Queue Elements = "+q);
		q.poll();
		q.poll();
		System.out.println("Queue Elements = "+q);
		q.poll();
		q.poll();
		System.out.println("Queue Elements = "+q);
		//System.out.println(q.poll());  //null
		
	}

}


/*
public class Day13_9 {

	public static void main(String[] args)
	{
		//Queue<String> q = new PriorityQueue<String>(); // UPCASTING
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("Sunbeam");
		q.offer("CoreJava");
		q.offer("Python");
		q.offer("C++");
		
		System.out.println("Queue Elements = "+q);
		q.poll();
		q.poll();
		System.out.println("Queue Elements = "+q);
		q.poll();
		q.poll();
		System.out.println("Queue Elements = "+q);
		System.out.println(q.poll());  //null
		
	}

}

*/




/*
public class Day13_9 {

	public static void main(String[] args)
	{
		//Queue<String> q = new PriorityQueue<String>(); // UPCASTING
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("Sunbeam");
		q.add("CoreJava");
		q.add("Python");
		q.add("C++");
		
		System.out.println("Queue Elements = "+q);
		q.remove();
		q.remove();
		System.out.println("Queue Elements = "+q);
		q.remove();
		q.remove();
		System.out.println("Queue Elements = "+q);
		System.out.println(q.remove());  //NoSuchElementException
		
	}

}
*/