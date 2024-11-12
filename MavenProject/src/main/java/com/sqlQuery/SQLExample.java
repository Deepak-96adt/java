package com.sqlQuery;

//import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut.Student;

public class SQLExample {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	
		NativeQuery sqlQuery = session.createSQLQuery("select * from student");
		List<Object []> sList = sqlQuery.list();
		
		for(Object[] std : sList) {
//			System.out.println(Arrays.toString(std));
			System.out.println(std[4]+" , "+std[3]);
		}
		
		session.close();
		sessionFactory.close();
	}
}
