package com.exercises.string;

import java.util.Scanner;

public class StringEndWith {
	public boolean checkStringEndsWithGivenChars(String inputString, String givenSubString) {
		boolean isStrEndsWithSubStr = false;
		if(inputString.endsWith(givenSubString)) {
			isStrEndsWithSubStr = true;
		}
		return isStrEndsWithSubStr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the original string: ");
		String userInputString1 = sc.nextLine();
		System.out.println("Enter the substring to check: ");
		String userInputString2 = sc.next();
		StringEndWith sew = new StringEndWith();
		if(sew.checkStringEndsWithGivenChars(userInputString1, userInputString2)) {
			System.out.println("Does "+userInputString1+" ends with "+userInputString2+" ? - True");
		} else {
			System.out.println("Does "+userInputString1+" ends with "+userInputString2+" ? - False");
		}
		sc.close();
	}

}
