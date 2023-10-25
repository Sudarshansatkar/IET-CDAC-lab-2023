import java.util.Arrays;

//create an array and display the array elements 
// using for loop
// using Arrays.toString()
// using for each loop / advanced for loop 

public class Day6_5 
{

	public static void main(String[] args) 
	{
		int a[]=new int[4];
		a[0]=11;
		a[1]=22;
		a[2]=33;
		a[3] =44;
		
		System.out.println("Displaying array elements using for loop : ");
		for(int i=0;i<4;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		
		System.out.println("Displaying array elements using toString() ");
		System.out.println(Arrays.toString(a));
	
		System.out.println("Displaying array elements using for each loop :");
		
		//for each element "i" of type "int" inside the array "a"
		// please print the element "i"
		//i = a[0]   i= a[1]   i = a[2]   i = a[3] .... i = a[n-1] 

		for(int i:a)
			System.out.print(i+"\t");
		
		
		
	}

}
