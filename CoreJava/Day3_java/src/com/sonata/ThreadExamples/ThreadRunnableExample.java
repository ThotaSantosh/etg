package com.sonata.ThreadExamples;

public class ThreadRunnableExample implements Runnable {
public void run() {
	try {
		System.out.println("Thread" + Thread.currentThread().getId() +"is running");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
public static void main(String[] args) {
	ThreadRunnableExample tr=new ThreadRunnableExample();
	Thread t1=new Thread(tr);
t1.start();
}}

