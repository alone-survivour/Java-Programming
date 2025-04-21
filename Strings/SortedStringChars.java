package com.basic2.strings;

import java.util.Arrays;

public class SortedStringChars {
	public String convertCharString(String str) {
		char[] letters = str.toCharArray();
		Arrays.sort(letters);
		//Capturing the digits and summing up
		int count = 0;
		for(int i=0; i<letters.length; i++) {
			if(Character.isDigit(letters[i])) {
				count = count + Character.getNumericValue(letters[i]);
			}
		}
		//Capturing the sorted alphabets and converting it as string
		String str3 = "";
		for(int i=0; i<letters.length; i++) {
			if(Character.isAlphabetic(letters[i])) {
				str3 = str3 + letters[i];
			}
		}
		str3 = str3 + Integer.toString(count);
		return str3;
	}

	public static void main(String[] args) {
		String s = "RtYuIABGhu1Pp8Q69";
		SortedStringChars ss = new SortedStringChars();
		System.out.println("Required String: "+ ss.convertCharString(s));

	}

}
