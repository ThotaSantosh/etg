package com.sonata.StreamApi;
import java.util.*;
public class DataBaseEmp {
public static List<Employee>getEmployee(){
	List<Employee>list=new ArrayList();
	list.add(new Employee(21018,"santoshM","SE",27235));
	list.add(new Employee(21019,"santoshR","SE",27235));
	list.add(new Employee(21011,"santoshY","SE",27235));
	list.add(new Employee(21012,"santoshS","SE",27235));
	list.add(new Employee(21013,"santoshT","SE",27235));
	return list;
}
}
