package com.sonata.LambdaExample;
import java.util.*;
public class BookDAO {
public List<Book>getBook(){
	List<Book> books=new ArrayList<>();
	books.add(new Book(101,"core java",400));
	books.add(new Book(103,"core html",400));
	books.add(new Book(102,"core js",400));
	return books;
}
}
