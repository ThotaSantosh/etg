package com.sonata.TestSuitExample;

public class MessageClass {
private String message;
public MessageClass(String message) {
	this.message=message;
}
public String printMessage() {
	System.out.println(message);
	return message;
}

public String salutationMessage() {
	message="Hi!"+message;
	System.out.println(message);
	return message;
}
}
