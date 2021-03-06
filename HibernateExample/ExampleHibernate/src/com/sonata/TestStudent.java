package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sonata.dao.StudentDAO;

public class TestStudent {

	
	public static void main(String[] args) {
		Student std = new Student();
		  std.setStdId(23);
		  std.setStdName("Ganesh123");
		  
		  Student std2=new Student();
		  std2.setStdId(21018);
		  std2.setStdName("santosh");
		  
		  Student std3=new Student();
		  std3.setStdId(21019);
		  std2.setStdName("san");
		  Student std4=new Student();
		  std4.setStdId(21028);
		  std4.setStdName("raju");
		  SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		s1.save(std);
		s1.save(std2);
		s1.saveOrUpdate(std3);
		s1.save(std4);
		s1.delete(std2);
		s1.delete(std);
		
		s1.getTransaction().commit();
		s1.close();

	}

}
