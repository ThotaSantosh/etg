package com.sonata.JavaStream;
import java.util.*;
import java.util.function.Predicate;
public class PredicateDemo implements Predicate<Integer> {
	
	public boolean test(Integer t) {
		if(t%2==0) {
			return true;
		}else {
			return false;
		}
			}
	public static void main(String[] args) {
		Predicate<Integer> predicate=new PredicateDemo();
		System.out.println(predicate.test(4));
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		list.stream().filter(predicate).forEach(t->System.out.println(t));
		
	}
}
