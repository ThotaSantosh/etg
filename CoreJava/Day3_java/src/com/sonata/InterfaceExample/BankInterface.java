package com.sonata.InterfaceExample;

public interface BankInterface {
int abc=20;
public double withDraw(double amount);
public double deposit(double amount);
default void newMethod() {
	System.out.println("newly added default method");
gen();
}
default void myMethod() {
	System.out.println("newly added default method");
}
private void gen() {
System.out.println("private method");
}
static void anotherNewMethod() {
	System.out.println("newly added static method");
}
}
