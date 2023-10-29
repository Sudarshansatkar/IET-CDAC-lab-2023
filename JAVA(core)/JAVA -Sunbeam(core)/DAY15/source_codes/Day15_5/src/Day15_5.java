import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// write a single byte in binary file ==> FileOutputStream 
// read a single byte from a binary file ==> FileInputStream
// 0.Exit 1. Write  2. Read 

// try-with resource

public class Day15_5 
{

	static Scanner sc = new Scanner(System.in);
	public static final String pathName="Demo.dat";
	
	
	public static void writeRecord() throws FileNotFoundException, IOException
	{
		try(FileOutputStream fos = new FileOutputStream(new File(pathName));)
		{
			byte data =123;
			fos.write(data);
			System.out.println("Data is written inside the file!!");
			
		}
		
	}
	
	
	public static void readRecord() throws IOException
	{
		
		try(FileInputStream fis = new FileInputStream(new File(pathName));)
		{
			byte value = (byte) fis.read();
			System.out.println("Data is read from binary file : "+value);
		}
		
		
	}
	
	
	public static int menuList()
	{
		System.out.println("Please enter Choice 0.Exit 1.Write 2.Read ");
		int choice = sc.nextInt();
		return choice;
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		int ch;
		while((ch = menuList())!=0)
		{
			switch(ch)
			{
				case 1:
					writeRecord();
				break;
				case 2:
					readRecord();
				break;
			}	//end of switch	 
		} //end of while
	} //end of main

} //end of class
