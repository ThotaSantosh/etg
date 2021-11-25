package com.sonata.StreamMapApi;
import java.security.KeyStore.Entry;
import java.util.*;
import java.util.stream.Collectors;
public class SortMapStream {
public static void main(String[] args) {
	Map<String,Integer> map=new HashMap<>();
	map.put("eight", 8);
	map.put("five", 5);
	map.put("six", 6);
	map.put("seven", 7);
	Set<Map.Entry<String,Integer> > st=map.entrySet();
	for(Map.Entry<String,Integer> me:st) {
		System.out.println(me.getKey()+":");
		System.out.println(me.getValue());
	}
	List<Entry> ent=new ArrayList(map.entrySet());
	ent.forEach(System.out::println);
	List<Integer> result2=map.values().stream()
			.collect(Collectors.toList());
	result2.forEach(System.out::println);
}
}
