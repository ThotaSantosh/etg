package com.sonata.LambdaExample;
import java.util.*;
public class BookServiceLambdaEx {
public List<Book>getBookinSort(){
	List<Book>books=new BookDAO().getBook();
	Collections.sort(books,(o1,o2)->
	o1.getName()
	.compareTo(o2.getName()));
	return books;
}
public static void main(String[] args) {
	BookServiceLambdaEx a1=new BookServiceLambdaEx();
	System.out.println(new BookServiceLambdaEx().getBookinSort());
}
}
