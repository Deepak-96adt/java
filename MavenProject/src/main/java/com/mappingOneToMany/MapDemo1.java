package com.mappingOneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo1 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Answer1 ans1 = new Answer1();
		ans1.setAns_id(789);
		ans1.setAns("java is high level language");
		
		Answer1 ans2 = new Answer1();
		ans2.setAns_id(788);
		ans2.setAns("java is open source");
		
		Answer1 ans3 = new Answer1();
		ans3.setAns_id(787);
		ans3.setAns("java follow oops concepts");

		Question1 qus1 = new Question1();
		qus1.setQus_id(989);
		qus1.setQus("what is java ?");
		
		ans1.setQuestion(qus1);
		ans2.setQuestion(qus1);
		ans3.setQuestion(qus1);
		
		List<Answer1> list = new ArrayList<Answer1>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(qus1);
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);
		
		
		tx.commit();
		
		Question1 ques = session.get(Question1.class, 989);
		System.out.println(ques.getQus());
		
//		for (Answer1 ans : ques.getAnswers()) {
//			System.out.println(ans.getAns());
//		}
	
		
		session.close();
		factory.close();
	}
}
