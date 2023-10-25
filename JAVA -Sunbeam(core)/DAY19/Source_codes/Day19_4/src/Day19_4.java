// Method Reference to a Constructor

@FunctionalInterface
interface MyInterface
{
	Demo display(String s);
}

class Demo
{
	public Demo(String str)
	{
		System.out.println(str);
	}
}


public class Day19_4 
{

	public static void main(String[] args)
	{
		MyInterface ref = Demo :: new;
		ref.display("Hello Akshita!!");
		

	}

}
