package com.exercises.string;

import java.util.Scanner;

public class RegionalMatchOfStrs {
	public void checkRegionalMatch(String inputString1, String inputString2) {
		boolean isRegionalMatch1 = inputString1.regionMatches(0, inputString2, 28, 8);
		boolean isRegionalMatch2 = inputString1.regionMatches(9, inputString2, 9, 8);
		if(isRegionalMatch1) {
			System.out.println("str1[0-9] == str2[28-35] ? --- True!!");
		} else {
			System.out.println("str1[0-9] == str2[28-35] ? --- False!!");
		}
		
		if(isRegionalMatch2) {
			System.out.println("str1[9-15] == str2[9-15] ? --- True!!");
		} else {
			System.out.println("str1[9-15] == str2[9-15] ? --- False!!");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String userInputString1 = sc.nextLine();
		System.out.println("Enter the second string: ");
		String userInputString2 = sc.nextLine();
		RegionalMatchOfStrs rmstr = new RegionalMatchOfStrs();
		rmstr.checkRegionalMatch(userInputString1, userInputString2);
		sc.close();

	}

}
