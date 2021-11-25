package com.sonata;

public class Rectangle extends Shape {
Rectangle(int l,int b,int w,int r){
	super(l,b,w,r);
}
Rectangle(){}
public double area(){
	super.area(length, breadth, width,radius);
	System.out.println("child class");
	return area=length*breadth*width;
}
public static void main(String args[]) {
	Rectangle R=new Rectangle();
	R.length=10;
	R.breadth=20;
	R.width=30;
	
	R.display();
	
}
}
