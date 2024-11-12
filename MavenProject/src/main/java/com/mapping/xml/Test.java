package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Session s = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
		Person p = new Person();
		p.setName("user2");
		p.setAddress("bhopal");
		
		Transaction tx = s.beginTransaction();
		s.save(p);
		tx.commit();
		s.close();
	}
}
