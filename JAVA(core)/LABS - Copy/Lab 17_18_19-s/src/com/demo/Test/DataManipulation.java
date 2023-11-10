package com.demo.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DataManipulation {
	public static void main(String[] args) throws ParseException {
		Scanner ssc =new Scanner(System.in);
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter Date");
		String d1 = ssc.next();
		try {
			Date dt1 = sd.parse(d1);
			System.out.println(dt1);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		
		LocalDate dt2 = LocalDate.parse(d1,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(dt2);
		
		System.out.println(dt2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Year : "+dt2.getYear());
		
		SimpleDateFormat sdf = new SimpleDateFormat ("MM/dd/yyyy",Locale.ENGLISH);
		Date firstDate = sdf.parse("08/22/2009");
		Date secondDate = sdf.parse("09/22/1998");
		
		
		long diffInMillies = Math.abs(secondDate.getTime()- firstDate.getTime());
		long diff = TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
		System.out.println("Difference Btw " + firstDate + "and " + secondDate + "is" + diff);
	}
}
