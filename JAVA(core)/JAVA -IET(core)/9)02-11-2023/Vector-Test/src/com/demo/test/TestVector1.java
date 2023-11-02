package com.demo.test;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Scanner;

public class TestVector1 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v =new Vector<>(5); // 9 is capacity and 9 is increment of capacity 
		// 	Vector<Integer> v =new Vector<>(5); // here capacity is 5 and capacity doubles after limit
		// Vector<Integer> v =new Vector<>();  //by default capacity is 10 and increment by 10  
		
		
		v.add(29);   // adds element in vector i.e 29 @ index 0;
		v.add(20);
		v.add(24);
		v.add(65);
		
		System.out.println(v);// displays all the elements of the vector
		
		System.out.println(v.get(1));  //prints element of the 1st index
	
		System.out.println("Size is:"+v.size());    // Calculates the size of vector
		System.out.println("Capacity is:"+v.capacity()); //calculates the capacity of vector
		
		v.add(27);
		System.out.println("After adding a element:");
		System.out.println("Size is:"+v.size());    // Calculates the size of vector
		System.out.println("Capacity is:"+v.capacity());
		
		v.add(12);
		v.add(13);
		v.add(13);
		v.add(13);
		v.add(13);
		
		System.out.println("After adding a element:");
		System.out.println("Size is:"+v.size());    // Calculates the size of vector
		System.out.println("Capacity is:"+v.capacity());
		
		//diplay the elements using enumeration
		Enumeration e=v.elements();
		System.out.println("using enumeration");
		while(e.hasMoreElements()) 
		{
			System.out.println(e.nextElement());
		}
		
		System.out.println("Display Elements by Stream:");
		//display data 1.8
				v.stream().forEach(x->System.out.println(x));
				v.stream().forEach(System.out::println);
		
		
		System.out.println("New Vector:");
		Vector<Integer> Vlst=new Vector<>(5);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements in the vecotor to add:");
		for(int i=0;i<Vlst.capacity();i++)
		{
			int a=sc.nextInt();
			Vlst.add(a);
		}
		
		System.out.println(Vlst);
		
		int s=0;
		
		for(int num:Vlst)
		{
			s=s+num;
		}
		
		System.out.println("Sum is:"+s);
		
		//Sum of Vector Elements
		//for(int i=0;i<size;)
	}

}
