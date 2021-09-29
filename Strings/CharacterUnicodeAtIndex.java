package com.exercises.string;

import java.util.Scanner;

public class CharacterUnicodeAtIndex {
	public int getCodePointAtValOfIndexStr(String inputString, int indexPosition) {
		int valOfCodePointAtIndex = inputString.codePointAt(indexPosition);
		return valOfCodePointAtIndex;
	}
	
	public int getCodePointBeforeIndex(String inputString, int indexPosition) {
		int unicodeValAtRealIndex = inputString.codePointBefore(indexPosition);
		return unicodeValAtRealIndex;
	}
	
	public int countCodePointsOfGivenStr(String inputString) {
		int countTheCodePoints = inputString.codePointCount(1, 10);
		return countTheCodePoints;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String userInputString = sc.nextLine();
		//System.out.println("Enter the index position you want to get unicode point value: ");
		//int userGivenIndexPos = sc.nextInt();
		CharacterUnicodeAtIndex c = new CharacterUnicodeAtIndex();
		//System.out.println("Character(Unicode point value) at index position "+userGivenIndexPos+" is "+c.getCodePointAtValOfIndexStr(userInputString, userGivenIndexPos));
		//System.out.println("Character(Unicode point value) at index position "+userGivenIndexPos+" is "+c.getCodePointBeforeIndex(userInputString, userGivenIndexPos));
		System.out.println("Number of unicode points is "+c.countCodePointsOfGivenStr(userInputString));
		sc.close();
	}

}
