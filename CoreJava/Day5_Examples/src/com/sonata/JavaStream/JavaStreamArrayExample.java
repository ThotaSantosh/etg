package com.sonata.JavaStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;
public class JavaStreamArrayExample {
public static void main(String[] args) throws Exception  {
	String names[]= {"santosh","Tulasi","Lalith","shailaja"};
	Arrays.stream(names).filter(x->x.startsWith("s")).sorted().forEach(System.out::println);
	Arrays.stream(new int[] {2,4,5,6,7,8})
	.map(x->x*x).average().ifPresent(System.out::println);
	
	List<String> people=Arrays.asList("simple","show","just","king");
	people.stream().map(String::toLowerCase).filter(x->x.startsWith("s")).forEach(System.out::println);
	Stream<String> lines= Files.lines(Paths.get("D:\\testout.txt"));
	lines.sorted().filter(x->x.length()>2).forEach(System.out::println);
	lines.close();
}
}
