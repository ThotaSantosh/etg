package com.sonata.InterfaceExample;

public class CurrentAcc extends Bank implements BankInterface {
public double withDraw(double amount) {
	return 0;
}
public double deposit(double amount) {
	return 0;
}
public static void main(String[] args) {
	BankInterface b1 =new CurrentAcc();
	b1.newMethod();
	b1.myMethod();
	BankInterface.anotherNewMethod();
}
}
