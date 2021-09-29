package com.exercises.string;

import java.util.Scanner;

public class CompareStringLexically {
	public boolean compareTwoStrsLexically(String inputString1, String inputString2) {
		boolean isTwoStringsEqual = true;
		if(inputString1.length() == inputString2.length()) {
			for(int i=0; i<inputString1.length(); i++) {
				if(inputString1.charAt(i)!= inputString2.charAt(i)) {
					isTwoStringsEqual = false;
				}
			}
		} else {
			isTwoStringsEqual = false;
		}
		return isTwoStringsEqual;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String userInputString1 = sc.next();
		System.out.println("Enter the second string: ");
		String userInputString2 = sc.next();
		CompareStringLexically cl = new CompareStringLexically();
		if(cl.compareTwoStrsLexically(userInputString1, userInputString2)) {
			System.out.println("Both strings are lexographically equal!");
		} else {
			System.out.println("Both strings are not lexographically equal!");
		}
		sc.close();
	}

}
