package com.sonata1;

public class ProductExample {
	int prodId;
	String prodName;
	double prodPrice;
	ProductExample(){}
	ProductExample(int p,String n,double pp){
		this.prodId=p;
		this.prodName=n;
		this.prodPrice=pp;
	}
	public double priceCal(int gst) {
		return prodPrice=prodPrice+gst;
	}
	public void display() {
		System.out.println(prodId);
		System.out.println(prodName);
		System.out.println(prodPrice);
	}

	public static void main(String[] args) {
		ProductExample p1=new ProductExample();
		p1.prodId=5432;
		p1.prodName="casuals";
		p1.prodPrice=2400;
		p1.display();
		p1.prodId=5436;
		p1.prodName="casuals";
		p1.prodPrice=2600;
		p1.display();
		

	}

}
