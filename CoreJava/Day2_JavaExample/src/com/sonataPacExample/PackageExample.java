package com.sonataPacExample;

public class PackageExample {
	private int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	protected int mul(int a,int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
	PackageExample p1=new PackageExample();
	p1.add(10, 3);
	p1.sub(20,10);
	p1.mul(13,40);
	p1.div(20,4);
	}

}
