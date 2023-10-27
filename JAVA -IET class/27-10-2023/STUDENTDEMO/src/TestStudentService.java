
import java.util.Scanner;
public class TestStudentService 
{
	
	static Student []sarr;
	static int cnt;
	
	static
	{
		sarr=new Student[100];
		sarr[0]= new Student(20,"Raj",8,9,9);
		sarr[1]= new Student(21,"Yogen",12,32,43);
		sarr[2]= new Student(22,"Stark",13,54,65);
		sarr[3]= new Student(23,"Tony",32,43,11);
		cnt=4;
		
	}
	
	public static void addNewStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID:");
		int sid=sc.nextInt();
		System.out.println("Enter name:");
		String sname=sc.next();
		System.out.println("Enter 3 sub marks:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		sarr[cnt]=new Student(sid,sname,m1,m2,m3);
		cnt++;
		
	}
	
	public static void diplayStudent()
	{
		
		for(int i=0;i<cnt;i++)
		{
			System.out.println(sarr[i]);
			
		}
		
	}
	
	public static Student displayById(int id1)
	{
	
		for (int i=0;i<cnt;i++)
		{
			if(sarr[i].getsid()==id1)
			{
				return sarr[i];
			}
		}
		return null;
		
		
	}

	
	public static Student updateMarks(int id2,int k1,int k2,int k3)
	{
		
		for(int i=0;i<cnt;i++)
		{
			if(sarr[i].getsid()==id2)
			{
				sarr[i].setm1(k1);
				sarr[i].setm2(k2);
				sarr[i].setm3(k3);
				return sarr[i];
			}
	
		}
		return null;
	}
	
	public static Student[] getByName(String nm)
	{
		int count=0;
		Student[] list1=new Student[5];
		
		for(int i=0; i<cnt;i++)
		{
			if(sarr[i].getname().equals(nm))
			{
				list1[count]=sarr[i];
				count++;
			}
		}
		if(cnt>0)
		{
			return list1;
		}
		return null;
	}
	

}
