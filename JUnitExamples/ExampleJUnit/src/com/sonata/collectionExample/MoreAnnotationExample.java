package com.sonata.collectionExample;
import org.junit.*;
public class MoreAnnotationExample {
@BeforeClass
public static void beforeClass() {
	System.out.println("in before class");
}
@AfterClass
public static void afterclass() {
System.out.println("in after class");
}
@Before
public void before() {
	System.out.println("in before");
}
@After
public void after() {
	System.out.println("in after");
}
@Test
public void testCase1() {
	System.out.println("in testCase 1");
}
@Test
public void testCase2() {
	System.out.println("in testCase2");
}
}
