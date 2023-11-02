package com.demo.test;
import com.demo.beans.*;
import java.util.ArrayList;

public class TestPersonList {

	public static void main(String[] args) {
		ArrayList<Person>plist=new ArrayList<>();
		plist.add(new Person(10,"Ashwini","44444"));
		plist.add(new Person(11,"Rajat","5555"));
		plist.add(new Person(12,"Archana","5555"));
		plist.add(new Person(13,"Mugdha","5555"));
		
		System.out.println(plist);
		
		int pos=plist.indexOf(new Person(11,"Rajat","5555"));
		System.out.println(pos);
		int pos2=plist.indexOf(new Person(12,"Archana","5555"));
		System.out.println(pos2);
		
		int pos1=plist.indexOf(new Person(15,null,null));
		System.out.println(pos1);
		
		
		

	}

}
