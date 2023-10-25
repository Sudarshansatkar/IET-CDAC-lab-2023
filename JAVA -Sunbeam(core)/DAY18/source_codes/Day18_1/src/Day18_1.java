interface TestInterface
{
	// abstract static method declaration
	void square(int a); 
	
	
	//add one method along with definition inside the interface
	// it is compulsory to make that method as static
	// you can call that method with the help of interfacename.methodname()
	
	//and if you are adding any method with the keyword "default"
	// It is called as DEFAULT METHOD
	//default methods can be called with the help of object name
	// of the class who implements the interface 
	
	default void disp()
	{
		System.out.println("Inside Display method");
	}
	
	
}



public class Day18_1 implements TestInterface 
{
	//define square() compulsory
	public void square(int a) 
	{
		System.out.println("Area = "+(a*a));
		
	}
	//@Override
	//public void disp()
	//{
		//System.out.println("Inside the display method of day18_1");
//	}

	
	public static void main(String[] args) 
	{
		Day18_1 dobj = new Day18_1();
		dobj.square(5);
		dobj.disp();

	}
	
	
}
