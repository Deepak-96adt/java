package com.mappingOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

 
		Question qus1 = new Question();
		qus1.setQus_id(989);
		qus1.setQus("what is java ?");
		
		Answer ans1 = new Answer();
		ans1.setAns_id(789);
		ans1.setAns("java is high level language");
		qus1.setAnswer(ans1);
	
		Question qus2 = new Question();
		qus2.setQus_id(654);
		qus2.setQus("what is collection api ?");
		
		Answer ans2 = new Answer();
		ans2.setAns_id(456);
		ans2.setAns("collection api work with group");
		qus2.setAnswer(ans2);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(qus1);
		session.save(ans1);
		session.save(qus2);
		session.save(ans2);
		
		
		tx.commit();
		
//		Question ques = session.get(Question.class, 989);
//		System.out.println(ques.getQus());
//		System.out.println(ques.getAnswer().getAns());	
		
		session.close();
		factory.close();
	}
}
