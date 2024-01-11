package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser;

public class UserTest
{

	public static void main(String[]args)
	{
		
		MyUser u1=new MyUser("Chair",53);
		MyUser u2=new MyUser("DSD",415);
		MyUser u3=new MyUser("DSD",415);
		MyUser u4=new MyUser("adas",415);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(u1);
		session.save(u2);
		session.save(u3);
		session.save(u4);
		tr.commit();
		session.close();
		sf.close();
		
		
	}
	
	
}
