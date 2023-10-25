package p1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day20_4
{
	
	static EmpPojo parseEmp(String line)
	{
		try
		{
			EmpPojo e = new EmpPojo();
			String parts[]= line.split(",");
			e.setId(Integer.parseInt(parts[0]));
			e.setEname(parts[1]);
			e.setJob(parts[2]);
			e.setMgr(Integer.parseInt(parts[3]));
			e.setSal(Integer.parseInt(parts[4]));
			e.setDeptno(Integer.parseInt(parts[5]));
			return e;
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	public static void main(String[] args)
	{
		// C:\Users\sunbeam\Desktop\Code\DAY20\emp.csv
		File f = new File(args[0]);
		
		ArrayList<EmpPojo> empList = new ArrayList<EmpPojo>();
		
		try(Scanner sc = new Scanner(f))
		{
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				EmpPojo e = parseEmp(line);
				if(e!=null)
					empList.add(e);
			}
		} //end of try
		
		catch(Exception e)
		{
			System.out.println("Exception occured");
		} 
				
		System.out.println("Employee Records");
		for(EmpPojo e : empList)
			System.out.println(e);
		
		System.out.println("Printing AL using lambda");
		empList.forEach(e -> System.out.println(e));
		
		
		System.out.println("Printing AL using MR");
		empList.forEach(System.out::println);
		
		
		System.out.println();
		
		
		empList.stream()
		.filter(e1 -> e1.getMgr() == 7839)
		.forEach(System.out::println);
		
	} // end of main 

} //end of class 
