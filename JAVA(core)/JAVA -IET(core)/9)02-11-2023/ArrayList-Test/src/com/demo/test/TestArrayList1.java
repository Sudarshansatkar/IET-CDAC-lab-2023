package com.demo.test;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.function.Predicate;

public class TestArrayList1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> plist=new ArrayList<>();
		System.out.println("ENter Data:");
		for(int i=0;i<10;i++)
		{
			int a=sc.nextInt();
			plist.add(a);
		}
		System.out.println(plist);
		
		int s=0;
		for(int num:plist)
		{
			s=s+num;
		}
		System.out.println("Addition of all Values: "+s);
		
		System.out.println("ENter number for deletion: ");
		int num=sc.nextInt();
		plist.remove(new Integer(num));
		System.out.println(plist);
		
		plist.removeIf((x)->(int)x==(num));
		System.out.println(plist);
	}
	
	
}
