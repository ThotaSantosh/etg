package com.sonata;

public class Circle extends Shape {
	private double r;
	Circle(int l,int b,int w,int r){
		super(l,b,w,r);
	}
	Circle(){}
	public double area(){
		super.area(length,breadth,width,radius);
		System.out.println("child class");
		return area=(int) (pi*r*r);
	}
	public static void main(String args[]) {
		Circle R=new Circle();
		R.radius=2;
		R.area();
		R.display();
		
	}
}
