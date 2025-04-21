package com.basic2.strings;

import java.util.Scanner;

public class StringReplacement {
	public String getNewString(String inputStr) {
		String resultStr1 = inputStr.replaceAll("Java", "Py_thon");
		String resultStr2 = resultStr1.replaceAll("Python", "Java");
		String resultStr3 = resultStr2.replaceAll("Py_thon", "Python");
		return resultStr3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String userInput = sc.nextLine();
		sc.close();
		StringReplacement sr = new StringReplacement();
		System.out.println("Original String given: "+userInput);
		System.out.println("Resultant String: "+sr.getNewString(userInput));
	}

}
