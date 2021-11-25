package com.sonata.TestSuitExample;
import static org.junit.Assert.assertEquals;
public class TestClass {
String message="santosh";
String message1="sonata";
MessageClass messageUtil=new MessageClass(message);

public void PrintMessage() {
	System.out.println("Inside testPrintMessage()");
	assertEquals(message1,messageUtil.printMessage());
}

}
