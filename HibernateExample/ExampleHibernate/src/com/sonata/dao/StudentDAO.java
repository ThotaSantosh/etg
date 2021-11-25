package com.sonata.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sonata.Student;

public class StudentDAO {
public Student getStudent(int id,String name) {
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	Session s1 = factory.openSession();
	Student st= (Student)s1.load(Student.class,2);
	s1.getTransaction().commit();
	s1.close();

	return st;
	
}
}
