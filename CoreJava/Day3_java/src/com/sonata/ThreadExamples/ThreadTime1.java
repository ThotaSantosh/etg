package com.sonata.ThreadExamples;

public class ThreadTime1 extends Thread{
ThreadTime1(String s){
	super(s);
}
public void run() {
	for(int i=1;i<=5;i++) {
		try {
			Thread.sleep(1000);
			System.out.println("thread executing"+Thread.currentThread());
		}
		catch(InterruptedException e) {System.out.println(e);}
	}
}
public static void main(String[] args) throws InterruptedException {
	ThreadTime1 t1=new ThreadTime1("one");
	ThreadTime1 t2=new ThreadTime1("two");
	t1.start();
	t1.join();
	t2.start();
	t2.join();
}
}
