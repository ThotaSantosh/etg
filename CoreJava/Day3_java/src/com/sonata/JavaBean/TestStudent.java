package com.sonata.JavaBean;

public class TestStudent {

	public static void main(String[] args) {
		Address a1=new Address();
		a1.setCity("guntur");
		a1.setState("Ap");
		a1.setPin(522002);
		
		Student s1=new Student();
		s1.setStdid(53);
		s1.setSname("santosh");
		s1.setSmarks(93);
		s1.setObj(a1);
		System.out.println(s1);
	}

}
