package com.sonata.LamdaExpression;

public interface MyFunctionalInterface {
void m1();
default void m2() {System.out.println("default method=1");};
static void m3() {System.out.println("default method=2");};
}
