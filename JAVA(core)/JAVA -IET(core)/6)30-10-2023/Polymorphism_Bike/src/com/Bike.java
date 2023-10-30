package com;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Poly2.Shine;

public class Bike
{
	protected  int i=3;
	  public static void main(String args[])
	  {  
	    Bike b = new Splendor();//upcasting  
	    b.run();    //function overridiing
	    
	    Splendor s1=new Splendor();
	    s1.run1();     
	    
	   Shine s=new Shine(); 
	   s.run2();
	   
	    Scanner sc=new Scanner(System.in);
	   System.out.println("eneter joining date(dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println(ldt);
	  }

	void run()
	{
		 System.out.println("Running");
		
	}
	  
}

