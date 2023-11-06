
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args)
	{
		//accepting data
		List<Integer> lst = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers");
		for(int i=0;i<10;i++)
		{
			int num=sc.nextInt();
			lst.add(num);
		}
		System.out.println(lst);
		
		//Addition of Integer
		int s=0;
		for(Integer num:lst)
		{
			s=s+num;
		}
		System.out.println("Addition is: "+s);
		
		//deletion of number
		System.out.println("Enter the number for deletion");
		int n=sc.nextInt();
		//lst.remove(n);    //removes number at given index
		lst.remove(new Integer(n));
		System.out.println(lst);
		System.out.println("Enter the number for deletion");
		int num1=sc.nextInt();
		lst.removeIf((x)->(int)x==num1);
		System.out.println(lst);
	}

}
