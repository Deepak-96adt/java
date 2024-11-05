package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		SessionFactory factory = cfg.buildSessionFactory();

//		another way of creating sessionFactory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Student student1 = new Student();
		student1.setId(125);
		student1.setCity("mumbai");
		student1.setName("karan sharma");

		Certificate certificate = new Certificate();
		certificate.setCourse("python");
		certificate.setDuration("6-month");
		student1.setCerti(certificate);

		Student student2 = new Student();
		student2.setId(127);
		student2.setCity("delhi");
		student2.setName("ishant sharma");

		Certificate certificate1 = new Certificate();
		certificate1.setCourse("JS");
		certificate1.setDuration("3-month");
		student2.setCerti(certificate1);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student1);
		session.save(student2);

		tx.commit();
		session.close();
		factory.close();
	}
}
