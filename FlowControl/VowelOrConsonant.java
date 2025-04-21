package com.exercises.conditionalStatements;

import java.util.Scanner;

public class VowelOrConsonant {
	public boolean checkVowelConsonant(String inputStr) {
		boolean isVowel= false;
		char[] lettersInStr = inputStr.toCharArray();
		boolean result1Cond1 = lettersInStr[0]=='a' || lettersInStr[0]=='e' || lettersInStr[0]=='i' || lettersInStr[0]=='o'|| lettersInStr[0]=='u'?true:false;
		boolean result2Cond2= lettersInStr[0]=='A' || lettersInStr[0]=='E' || lettersInStr[0]=='I' || lettersInStr[0]=='O'|| lettersInStr[0]=='U'?true:false;
		if(result1Cond1 || result2Cond2) {
			isVowel = true;
		}
		return isVowel;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet to check: ");
		String userInput = sc.next();
		VowelOrConsonant vc = new VowelOrConsonant();
		if(userInput.length() == 1) {
			if(vc.checkVowelConsonant(userInput)) {
				System.out.println(userInput+" is an vowel");
			} else {
				System.out.println(userInput+" is an consonant");
			}
		} else {
			System.out.println("Alphabets cannot be more than one character!!!");
		}
		sc.close();
	}
}
