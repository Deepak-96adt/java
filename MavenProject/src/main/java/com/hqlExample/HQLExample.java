package com.hqlExample;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQLExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = factory.openSession();
		
		// select HQL
//		String q = "from Student as s where s.city=:x and s.name=:y";
//		Query qObj = s.createQuery(q);
//		qObj.setParameter("x","indore");
//		qObj.setParameter("y","student Demo");
		
//		List<Student> sList = qObj.list();
//		for(Student std : sList) {
//			System.out.println(std.getName()+" : "+std.getCerti().getCourse());
//		} 
		

//		Transaction tx = s.beginTransaction();
		
		// Delete HQL
//		Query q2 = s.createQuery("delete from Student s where s.city=:c");
//		q2.setParameter("c", "new york");
//		Transaction tx = s.beginTransaction();
//		int result = q2.executeUpdate();
//		System.out.println("Deleted : "+result);
//		tx.commit();
		
		//update HQL
//		Query q2 = s.createQuery("update Student s set s.name=:n where s.city=:c");
//		q2.setParameter("n", "updated new name");
//		q2.setParameter("c", "indore");
//		int result = q2.executeUpdate();
//		System.out.println("updated : "+result);

//		tx.commit();
		
		// join table with query
//		Query q3 = s.createQuery("select q.question , a.answer from Question as q INNER JOIN q.answers as a");
//		List<Object []> list3= q3.getResultList();
//		for(Object [] arr : list3) {
//			System.out.println(Arrays.toString(arr));
//		}
		s.close();
		factory.close();
	}

}
