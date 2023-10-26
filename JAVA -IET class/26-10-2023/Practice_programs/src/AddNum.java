import java.util.Scanner;

public class AddNum {
	
	public static int Addition(int num1,int num2)
	{
		return num1+num2;
		
	}
	public static int Add_digit(int num1)
	{
		int s=0;
		while (num1!=0)
				{
					int rem=num1%10;
					s=s+rem;
					num1=(int)(num1/10);
				}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int ans=Addition(num1,num2);
		System.out.println("Addition: "+ans);
		int ans1=Add_digit(num1);
		System.out.println("Addition of two digits: "+ans1);
		sc.close();

	}

}
