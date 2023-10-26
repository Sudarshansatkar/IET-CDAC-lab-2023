
public class Stringfunc {

	public static void main(String[] args) 
	{
		
		String s="Test String , asc";
		System.out.println("uppercase" +s.toUpperCase());
		System.out.println("lowercase" +s.toLowerCase());
		System.out.println("charAt"+" is " +s.charAt(2));
		System.out.println("length" + s.length());
		System.out.println(s.split(","));
		String[] sarr=s.split(",");
		
		System.out.println(s.substring(3,6));
		System.out.println(s.substring(3));
		System.out.println(s.indexOf("s"));
		System.out.println(s.lastIndexOf("s"));
		
		StringBuilder sb=new StringBuilder("Strings123  ");
		sb.append("testing");
		System.out.println(sb);
		
	}

}
