package com.sonata.JavaStream;
import java.util.*;
import java.util.function.Supplier;
public class SupplierDemo implements Supplier<String> {
@Override
public String get() {
	return "Java Stream API:";
}
public static void main(String[] args) {
	Supplier<String> supplier= new SupplierDemo();
	List<String> list=Arrays.asList("a","b");
	System.out.println(list.stream().findAny().orElseGet(supplier));
}
}
