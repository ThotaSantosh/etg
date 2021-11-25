package com.sonata.CollectionExamples;
import java.util.*;
public class ProductList {

	public static void main(String args[]) {
		List<Product> p1=new LinkedList<Product>();
		p1.add(new Product(123,"Tv",345));
		p1.add(new Product(124,"Mobile",456));
		p1.add(new Product(125,"Laptop",567));
		for(Product p2:p1) {
			System.out.println(p2.pId+" "+p2.pName+" "+p2.pPrice);
		}
		
		LinkedList<String> l1=new LinkedList<String>();
		int b=10;
		
		l1.add("santosh");
		l1.addFirst("Thota");
		System.out.println(l1);
		
		Iterator<String> i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
