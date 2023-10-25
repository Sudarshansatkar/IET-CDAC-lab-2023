//fetch all the values of enum Products and display 
// name and ordinal of all

enum Products
{
	MOBILE,LAPTOP,WATCH,IPAD;
}


public class Day7_2 {

	public static void main(String[] args) 
	{
		
		Products arr[] = Products.values();
		for(Products p : arr)
			System.out.println("Name = "+p.name()+" Ordinal = "+p.ordinal());
		
		Products value = Products.values()[1];
		System.out.println("Name = "+value.name()+" Ordinal = "+value.ordinal());
		
		
	}

}
