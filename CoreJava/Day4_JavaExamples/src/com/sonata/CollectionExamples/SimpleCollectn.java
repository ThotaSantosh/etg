package com.sonata.CollectionExamples;
import java.util.*;
public class SimpleCollectn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> l1=new ArrayList<String>();
l1.add("santosh");
l1.add("next");
System.out.println(l1);
for(Object name:l1) {
	System.out.println(name);
}

Collection<String> l2=new LinkedList<String>();
l2.add("ravi");
l2.add("manoj");
l2.add("manu");
l2.add("santosh");
System.out.println(l2);
for(Object Name:l2) {
	System.out.println(Name);
}
	}

}
