import java.io.File;
import java.io.IOException;

public class Day15_1 {

	public static void main(String[] args) 
	{
		try 
		{
			String pathname = "Demo.txt";
			File fobj = new File(pathname);
			boolean status = fobj.createNewFile();
			System.out.println("Status  = "+status);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
