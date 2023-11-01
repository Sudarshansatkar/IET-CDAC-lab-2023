
public class CUSTOMER implements SBI,HDFC
{
	
	public static void main(String[] args)
	{	
		//object of class created and ATM interface called
		CUSTOMER c1=new CUSTOMER();
		c1.Balance();
		System.out.println();
		
		//object of class Customer created with ref to SBI interface
		SBI s1=new CUSTOMER();
		//s1.Balance();
		System.out.println();
		
		//object of class Customer created with ref to HDFC interface
		
		HDFC h1=new CUSTOMER();
		//h1.Balance();
		
		
		ATM a1=new CUSTOMER();
		a1->Balance();
		
		
	}

	@Override
	public void Balance() 
	{
		// TODO Auto-generated method stub
	SBI.super.Balance();
	SBI.super.Balance1();
	HDFC.super.Balance();
	HDFC.super.Balance2();
		
	}


}
