package com.exercises.string;

import java.util.Scanner;

public class HashCodeGenerator {
	public int generateHashCodeForStr(String inputString) {
		return inputString.hashCode();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the original string: ");
		String userInputString = sc.nextLine();
		HashCodeGenerator hcg = new HashCodeGenerator();
		int resultantValueCode=hcg.generateHashCodeForStr(userInputString);
		System.out.println("The hascode value for "+userInputString+" is "+resultantValueCode);
		sc.close();
	}

}
