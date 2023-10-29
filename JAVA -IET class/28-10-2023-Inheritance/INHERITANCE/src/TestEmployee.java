import java.time.LocalDate;
public class TestEmployee
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee(1,"SKS","1111","SKS@gmail.com",20,"HR",LocalDate.of(2001,01,01));
		System.out.println(e1);
		
		//member constructor called and toString is caleed for Member
		Member m1=new Member(3,"CRB","333","CRB@gmail.com","GOLD",20000);
		System.out.println(m1);
		
		//vendor para constructor is passed and toString is called for vendor
		Vendor v1=new Vendor(2,"RGS","2222","RGS@gmail.com",30,"CR",LocalDate.of(2002,02,03),100,20000);
		System.out.println(v1);
		
		
	//upcasting person can access Employee methods
		Person p1=new Employee();
		((Employee)p1).setDept(85);
		
		int dept2=((Employee)p1).getDept();
		System.out.println(dept2);
		
	//downcasting - Vendor can access Employee methods. ??????????????????????????////
		
		Vendor v2=(Vendor)e1;
		
		((Vendor)e1).setDept(95);
		int dept3=e1.getDept();
		System.out.println(dept3);
	}

}
