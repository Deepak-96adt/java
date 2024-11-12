package com.hqlPagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class HQLPagination {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = factory.openSession();
		
		Query q = s.createQuery("from Student");
		
		q.setFirstResult(0);
		q.setMaxResults(4);
		
		List<Student> sList = q.getResultList();
		
		for(Student std : sList) {
			System.out.println(std.getName());
		}
		
		s.close();
		factory.close();
	}
}
