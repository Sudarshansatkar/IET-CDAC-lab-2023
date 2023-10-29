
public class StringDemo

{

	public static void main(String[] args) 
	
	{
			String s="Hello";
			String s1="Hello";
			String s2="welcome";
			String s3="welcome";
			
			s=s+"world";
			String s4="Hello";
			String s5=new String("Hello");
			
			System.out.println("s3==s2"+" is "+ (s3==s2));
			System.out.println("s==s1"+" is "+ (s==s1));
			System.out.println("s4==s5"+" is "+ (s4==s5));
			System.out.println("s4==s5"+" is "+ (s4==s5));
			System.out.println("s3.compareTo(s5)"+" is "+s3.compareTo(s5));
			System.out.println("s1 equals s5"+" is "+(s1.equals(s5)));

	}

}
