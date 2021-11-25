package com.sonata1;

public class TshirtsExample {
	String colour;
	String material;
	String design;
	TshirtsExample(){}
	TshirtsExample(String c,String m,String d){
		this.colour=c;
		this.material=m;
		this.design=d;
			}
	public void display() {
		System.out.println(colour);
		System.out.println(material);
		System.out.println(design);
	}
	public static void main(String[] args) {
		TshirtsExample t1=new TshirtsExample();
		t1.colour="red";
		t1.material="cotton";
		t1.design="flowers";
		t1.display();
		System.out.println("small");
		t1.colour="blue";
		t1.material="cotton";
		t1.design="print";
		t1.display();
		System.out.println("Large");
		t1.colour="red";
		t1.material="cotton";
		t1.design="floating";
		t1.display();
		System.out.println("extra-large");
		

	}

}
