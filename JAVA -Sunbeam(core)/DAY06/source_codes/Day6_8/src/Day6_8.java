import java.util.Arrays;

// Methods of Arrays class



public class Day6_8 {

	public static void main(String[] args) 
	{
		int a[]= {6,3,4,7,8,9,1,2,5};
		System.out.println("Before sort = "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sort = "+Arrays.toString(a));
		System.out.println("First two elements of an array : ");
		System.out.println(a[0]+"\t"+a[1]);
		Arrays.fill(a,3,6, 555);
		System.out.println("After filling = "+Arrays.toString(a));
		
		
	}
}




/*
public class Day6_8 {

	public static void main(String[] args) 
	{
		int a[]= new int[5];
		Arrays.fill(a, 4);
		System.out.println(Arrays.toString(a));
		
	}
}

*/



/*
public class Day6_8 {

	public static void main(String[] args) 
	{
		int a[]= {11,22,33,44,55};
		int b[]= {11,22,33,44,55};
		System.out.println("A equals B = "+Arrays.equals(a, b));
	}
}
*/


/*
public class Day6_8 {

	public static void main(String[] args) 
	{
		int a1[]= {11,22,33,44,55};
		System.out.println("Search element 33 = "+Arrays.binarySearch(a1, 33));
		System.out.println("Search element 44 = "+Arrays.binarySearch(a1, 44));
		System.out.println("Search element 88 = "+Arrays.binarySearch(a1, 88));
	}
}

*/



/*
public class Day6_8 {

	public static void main(String[] args) 
	{
		int a1[]= {10,20,30,40,50,60,70,80};
		int result = Arrays.binarySearch(a1, 168);
		System.out.println("Result = "+result);
		//index of the search key, if it is contained in the array
		//otherwise, (-(insertion point) - 1)
		
	}

}
*/