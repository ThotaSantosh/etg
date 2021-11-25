package com.sonata;

public class Shape {
int length;
int breadth;
int width;
int radius;
double pi=3.14;
int area;
Shape(int l,int b,int w,int r) {
	this.length=l;
	this.breadth=b;
	this.width=w;
this.radius=r;
}
public Shape() {
	// TODO Auto-generated constructor stub
}
public double area(int l,int b, int w,int r) {
	return area;
}
public void display() {
	System.out.println(area);
}
public static void main(String args[]) {
Shape s1=new Shape();
s1.display();
}
}
