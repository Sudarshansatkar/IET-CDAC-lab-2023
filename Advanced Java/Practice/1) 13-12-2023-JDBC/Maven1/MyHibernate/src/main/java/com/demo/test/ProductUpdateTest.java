package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class ProductUpdateTest 
{
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p1=session.get(Product.class,1); //persistent
		session.close();
		//now product is in dettached state
		//p1.setPname("SCSDS");
		
		
//		
//		//reattaching session
//		Session session1=sf.openSession();
//		Product p2=session1.get(Product.class,2); //persistent
//	//	System.out.println("before commit "+p2);
//		Transaction tr2=session1.beginTransaction();
//		//throw an exception NonUniqueObjectException
//	   //session1.update(p2);
//		//session1.saveOrUpdate(p1);
//		session1.merge(p1);
//		tr2.commit();
//		session1.close();
//		sf.close();
		
		// setting two products
		
		Session sess2=sf.openSession();
		Transaction tr3=sess2.beginTransaction();
		
		Product p3=sess2.get(Product.class,1);
		Product p4=sess2.get(Product.class,2);
		
		p3.setPname("Shirt");
		p4.setPname("Jeans");
		
		sess2.update(p3);
		sess2.update(p4);
		
		tr3.commit();
		
		sess2.close();
		
		

	}

}
