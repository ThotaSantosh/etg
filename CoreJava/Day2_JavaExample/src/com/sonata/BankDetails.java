package com.sonata;

public class BankDetails {
	static int accNo;
	static String accName;
	static double accBal;
	//default constructor
	void BankDetails(){}
	//constructor with parameters
	BankDetails(int a,String n,double b){
		this.accNo= a;
		this.accName=n;
		this.accBal=b;
		
	}
	public double deposit() {
		return accBal=accBal+10;
	}
	public double withdraw() {
		return accBal=accBal-10;
	}
	public void display() {
		System.out.println(accNo);
		System.out.println(accName);
		System.out.println(accBal);
		
	}

	public static void main(String[] args) {
		BankDetails b1=new BankDetails(accNo, accName, accBal);
		b1.accNo=101;
		b1.accName="santosh";
		b1.accBal=29641;
		b1.display();
		BankDetails b2=new BankDetails(0, accName, accBal);
		b2.accNo=102;
		b2.accName="lalith";
		b2.accBal=39641;
		b2.display();
	BankDetails b3=new BankDetails(103,"Durgeswari",40510);
	b3.display();
	}

}
