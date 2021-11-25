package com.sonata.AnnotationExamples;
class ShowOne{
	public void show() {
		System.out.println("it is my showone");
	}
}
class ShowTwo extends ShowOne{
	public void show() {
		super.show();
		System.out.println("it is my showTwo");
	}
}
public class MyAnnotation {
public static void main(String args[]) {
	ShowTwo s1=new ShowTwo();
	s1.show();
}
}
