package com.sonata.ThreadExamples;

class Hi extends Thread{
		public void run(){
			for(int i=1;i<=5;i++) {
				System.out.println("hi");
				try {Thread.sleep(1000);}
				catch(InterruptedException e) {System.out.println(e);}
			}
			}
			}
class Hello extends Thread {
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("hello");
		try {Thread.sleep(1000);}
		catch(InterruptedException e){System.out.println(e);}
	}
	}
	}
	public class ThreadTime{
	public static void main(String[] args)throws Exception {
		Hi ob1=new Hi();
		Hello ob=new Hello();
		ob1.start();
		ob.start();
	}
}

