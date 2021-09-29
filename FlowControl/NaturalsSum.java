package com.exercises.conditionalStatements;

import java.util.Arrays;
import java.util.Scanner;

public class NaturalsSum {
	public int[] generateNaturalNums(int lengthOfNums) {
		int[] NaturalNumsInArray = new int[lengthOfNums];
		for(int i=0; i<NaturalNumsInArray.length; i++) {
			NaturalNumsInArray[i] = i+1;
		}
		return NaturalNumsInArray;
	}
	public int generateSumOfNums(int NumsLimit) {
		int SumOfNaturals = (NumsLimit *(NumsLimit+1))/2;
		return SumOfNaturals;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit to generate natural numbers: ");
		int userInputLimit = sc.nextInt();
		NaturalsSum n = new NaturalsSum();
		System.out.println("The first "+userInputLimit+" natural numbers are: "+Arrays.toString(n.generateNaturalNums(userInputLimit)));
		System.out.println("Sum of "+userInputLimit+" natural numbers is: "+n.generateSumOfNums(userInputLimit));
		sc.close();
	}

}
