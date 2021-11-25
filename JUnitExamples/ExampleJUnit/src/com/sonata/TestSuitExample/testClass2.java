package com.sonata.TestSuitExample;
import static org.junit.Assert.assertEquals;
public class testClass2 {
	String message="Santosh";
	MessageClass messageUtil=new MessageClass(message);
	
	public void testSalutationMessage() {
		System.out.println("inside testSalutationMessage()");
		message="Hi!" + "Robert";
		assertEquals(message,messageUtil.salutationMessage());
	}

}
