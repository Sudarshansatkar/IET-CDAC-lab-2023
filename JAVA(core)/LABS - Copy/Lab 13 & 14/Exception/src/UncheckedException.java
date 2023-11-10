

public class UncheckedException {

	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println(str);
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("String is null");
			System.out.println("Error Occured: "+e.getMessage());
		}
		
	}

}

