package com.sonata.serializable;
import java.io.*;
public class EmployeeSerializ {
public static void main(String[] args) throws IOException {
	Employee obj=new Employee(21018,"thota santosh","guntur");
	ObjectOutputStream oos=null;
	FileOutputStream fos=null;
	Employee ob=null;
	try {
		fos=new FileOutputStream("D:\\Employee.ser");
		oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
	}
	finally {
		oos.close();
		fos.close();
	}
	System.out.println("serialization Done!");
	FileInputStream fis=new FileInputStream("D:\\Employee.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	try {
		ob=(Employee)ois.readObject();
		ois.close();
		fis.close();
	}catch(ClassNotFoundException s) {System.out.println(s);}
	System.out.println("Employee Id is"+ob.getEmpId());
	System.out.println("Employee Add is"+ob.getEmpAdd());
}
}
