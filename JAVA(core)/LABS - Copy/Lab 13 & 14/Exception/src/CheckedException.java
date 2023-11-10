
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckedException {

	public static void main(String [] args) 
	{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
			fis=new FileInputStream("test1.txt");
			fos=new FileOutputStream("testcopy.txt");
			int x=fis.read();
			while(x!=-1)
			{
				fos.write(x);
				x=fis.read();				
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	
}