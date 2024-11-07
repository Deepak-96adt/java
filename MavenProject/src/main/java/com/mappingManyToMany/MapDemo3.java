package com.mappingManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo3 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Emp emp1 = new Emp();
		emp1.seteId(122);
		emp1.seteName("employee1");
		
		Emp emp2 = new Emp();
		emp2.seteId(123);
		emp2.seteName("employee2");
		
		Emp emp3 = new Emp();
		emp3.seteId(124);
		emp3.seteName("employee3");
		
		Project proj1 = new Project();
		proj1.setpId(321);
		proj1.setpName("java project");

		Project proj2 = new Project();
		proj2.setpId(322);
		proj2.setpName("spring project");
		
		Project proj3 = new Project();
		proj3.setpId(323);
		proj3.setpName("hibernate project");
		
		List<Emp> empList = new ArrayList<Emp>();
		List<Project> projList = new ArrayList<Project>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		projList.add(proj1);
		projList.add(proj2);
		projList.add(proj3);
		
		emp1.setProject(projList);
		proj3.setEmp(empList);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(proj1);
		session.save(proj2);
		session.save(proj3);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
