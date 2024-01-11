package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address1;
import com.demo.model.MyUser1;

public class TestMyUser1Address1 {
	public static void main(String[] args) {
		Address1 addr=new Address1(1,"Moshi","pune");
		Address1 addr1=new Address1(2,"PCMC","pune");
		MyUser1 u1=new MyUser1(10,"SKS",addr);
		MyUser1 u2=new MyUser1(11,"RGS",addr1);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(addr);
		sess.save(addr1);
		sess.save(u1);
		sess.save(u2);
		
		tr.commit();
		
		
	}
}
