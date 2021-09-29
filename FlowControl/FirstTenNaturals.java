package com.exercises.conditionalStatements;

import java.util.Arrays;
import java.util.Scanner;

public class FirstTenNaturals {
	public int[] generateNaturalNums(int lengthOfNums) {
		int[] NaturalNumsInArray = new int[lengthOfNums];
		for(int i=0; i<NaturalNumsInArray.length; i++) {
			NaturalNumsInArray[i] = i+1;
		}
		return NaturalNumsInArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit to generate natural numbers:");
		int userInputLimit = sc.nextInt();
		FirstTenNaturals f = new FirstTenNaturals();
		System.out.println("First "+userInputLimit+" natural numbers are: "+Arrays.toString(f.generateNaturalNums(userInputLimit)));
		sc.close();
	}
}
