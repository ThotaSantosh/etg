package com.sonata.ExceptionTest;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
public class TestMessage {
String message="sonata";
MessageException mE=new MessageException(message);
@Test(expected =ArrayIndexOutOfBoundsException.class)

public void testprintMessage() {
	System.out.println("inside the printMessage");
	mE.printMessage();
}
@Ignore
@Test
public void testaddMessage() {
	System.out.println("inside add message");
	assertEquals(message,mE.addMessage());
}
}
