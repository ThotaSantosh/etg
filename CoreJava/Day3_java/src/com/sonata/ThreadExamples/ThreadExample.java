package com.sonata.ThreadExamples;

public class ThreadExample extends Thread {
ThreadExample(String n){
	super(n);
}
public void show() {
	System.out.println("show this");
}
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("hello");
	}
	System.out.println(Thread.currentThread());
}
public static void main(String[] args) {
	ThreadExample e1=new ThreadExample("one");
	e1.start();
	e1.show();
	ThreadExample t2=new ThreadExample("two");
	t2.start();
	t2.show();
}
}
