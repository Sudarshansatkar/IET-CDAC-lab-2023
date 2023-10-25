//generic always works with non primitive type 
// in this example class Test is taking ONE type parameter of type T

class Test<T>
{
	T num;  // num is a generic type field 
	
	Test(T num) // constructor is taking one parameter of type T 
	{
		this.num=num;
	}
	
	T getData() // method is returning one parameter of type T
	{
		return this.num;
	}
}
public class Day10_2 {

	public static void main(String[] args)
	{
		//Test tobj = new Test(10); // raw type 
		// if we do not specify the type parameter
		// at the time of using the class
		
		Test<Integer> t1 = new Test<Integer>(10);
		
		Test<Double> t2= new Test<Double>(5.5);
		
		Test<Float> t3= new Test<Float>(4.5f);
		
		Test<String> t4= new Test<String>("Sunbeam");
		
		System.out.println("T1 = "+t1.getData());
		System.out.println("T2 = "+t2.getData());
		System.out.println("T3 = "+t3.getData());
		System.out.println("T4 = "+t4.getData());
		
		
		
	}

}
