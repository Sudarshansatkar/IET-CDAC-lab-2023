import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

// read and write object from file (binary file)
// ObjectInputStream
// ObjectOutputStream

// Empolyee eobj = new Employee("Akshita",36,"Sunbeam");
// Writing state of object inside the file is called as SERIALIZATION
// Reading state of object from the file is called as DE-SERIALIZATION


class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	String org;
	public Employee(String name, int age, String org) {
		super();
		this.name = name;
		this.age = age;
		this.org = org;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", org=" + org + "]";
	}
	
}





public class Day16_3 {

	static Scanner sc = new Scanner(System.in);
	static final String pathName="Test.dat";
	
	
	public static void writeRecord() throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathName))));)
		{
			Employee emp = new Employee("Akshita",36,"Sunbeam");
			oos.writeObject(emp);
		}
	}
	
	public static void readRecord() throws IOException, ClassNotFoundException
	{
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(pathName))));)
		{
			Employee e = (Employee) ois.readObject();
			System.out.println("Object is read from the file");
			System.out.println(e);
			
			   
		}
	}
	
	static int menuList()
	{
		int choice;
		System.out.println("Please enter choice 0.Exit 1.Write 2.Read");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
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
			}
		}
	}

}
