package com.sonata.CollectionExamples;
import java.util.*;
public class CollectionExample {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add("mom");
		l1.add("dad");
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		
		LinkedList l2=new LinkedList();
		l2.addFirst("simba");
		l2.addLast("rambo");
		System.out.println("leo");
		System.out.println(l2);
		l2.removeLast();
		System.out.println(l2);

		HashSet h1=new HashSet(l2);
		h1.add("Leo");
		System.out.println(h1);
		
		TreeSet t1=new TreeSet(h1);
		t1.add("Lalith");
		System.out.println(t1);
	}

}
