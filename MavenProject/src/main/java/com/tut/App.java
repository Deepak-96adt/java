package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();
//        System.out.println(sessionFactory);
        Student st = new Student();
        st.setId(103);
        st.setName("user2");
        st.setCity("ujjain");
        System.out.println(st);
        
        Address ad = new Address();
        ad.setCity("Indore");
        ad.setAddedDate(new Date());
        ad.setItsDouble(123.543);
        ad.setOpen(true);
        ad.setStreet("56 dukan");
        
        FileInputStream iFile = new FileInputStream("src/main/java/String methods.png");
        byte[] data = new byte[iFile.available()];
        iFile.read(data);
        ad.setImage(data);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
    }
}
