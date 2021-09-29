package com.basic.strings;

public class GreetName {
	String name = "";
	public String greet(String name) {
		return name;
	}
	public static void main(String[] args) {
		GreetName gn = new GreetName();
		System.out.println("Hello\n" + gn.greet("Alexander"));
	}
}
