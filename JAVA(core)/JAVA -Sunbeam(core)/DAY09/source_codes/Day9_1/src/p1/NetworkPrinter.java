package p1;

// NetworkPrinter is the implementing the interface Printer 
// implementing the interface means , we must have definition of all the
// methods declared inside the interface

public class NetworkPrinter implements Printer
{

	@Override
	public void print(String msg) // overridden method 
	{
		System.out.println("Inside Print method of network printer"+msg);
		
	}
	
	//can a implemented class add its own method definitions?? YES
	
	void disp() // non overridden
	{
		System.out.println("Inside display method of network printer");
	}
	

}
