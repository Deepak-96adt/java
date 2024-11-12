package com.criteria;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tut.Student;

public class CriteriaExample {

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria criteria = session.createCriteria(Student.class);
		// criteria.add(Restrictions.eq("certi.course", "abc"));
		criteria.add(Restrictions.like("certi.duration", "3%"));
		List<Student> sList= criteria.list();
		
		for(Student std : sList) {
			System.out.println(std);
		}
		
		session.close();
	}

}
