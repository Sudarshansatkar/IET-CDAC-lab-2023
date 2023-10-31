import java.time.LocalDate;

public class BankService
{
	static int cnt;
	static BankAccount[] acrr;
	
	static
	{
		acrr=new BankAccount[100];
		acrr[0]=new SavingAccount("ICICI","CHINCHWAD","ICICI0321","PUNE",2000,"SKS","9999","SKS@gmail.com",LocalDate.of(2002,12,30),50000,4125,7.7);
		acrr[1]=new CurrentAccount("HDFC","PIMPRI","HDFC0321","WAKAD",5000,"RGS","8888","RGS@gmail.com",LocalDate.of(2002,8,15),70000,5485,20000);
		acrr[2]=new SavingAccount("AXIS","MOSHI","AXISI0321","CHIKHALI",1000,"CRB","5555","PRH@gmail.com",LocalDate.of(2009,6,9),100000,5874,6.5);
		
	}
	
	
	
	public 

}