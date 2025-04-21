package com.exercises.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringToByteArr {
	public String getByteArrOfString(String inputString) {
		byte[] byteArrFromString = inputString.getBytes();
		String byteArrayToString = Arrays.toString(byteArrFromString);
		return byteArrayToString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the original string: ");
		String userInputString = sc.nextLine();
		StringToByteArr sbr = new StringToByteArr();
		System.out.println("Original string: "+userInputString);
		System.out.println("After converting the string to byte array: "+sbr.getByteArrOfString(userInputString));
		sc.close();
	}

}
