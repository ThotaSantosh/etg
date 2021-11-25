package com.sonata;

public class SavingAcc extends BankDetails{
	SavingAcc(int accNo,String accName,double accBal){
		super(accNo,accName,accBal);
	}

	public double withdraw() {
		super.withdraw();
		System.out.println("child class");
		return accBal=accBal-10;
	}
		
	public static void main(String[] args) {
		SavingAcc s1=new SavingAcc(accNo, accName, accBal);
		s1.accNo=101;
		s1.accName="santosh";
		s1.accBal=42000.456;
		s1.display();
	SavingAcc s2=new SavingAcc(102,"raju",2909);
	s2.display();
	System.out.println(s2.withdraw());
	}

}
