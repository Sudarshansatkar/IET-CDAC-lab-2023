// displaying various arrays using for each 
// for each loop iterates automatically from 0 to arr.length-1 

public class Day6_6 
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		float f[]= {3.2f,4.5f,6.5f,9.8f,7.5f};
		String str[]= {"Sunbeam","Java","Python","ML"};
		
		for(int i : a)
			System.out.print(i+"\t");
		
		System.out.println("\n------------------------");
		for(float element : f)
			System.out.print(element+"\t");
		
		System.out.println("\n------------------------");
		for(String s : str)
			System.out.print(s+"\t");
		

	}

}
