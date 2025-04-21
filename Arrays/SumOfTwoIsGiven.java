package com.exercises.arrays;

import java.util.Scanner;

public class SumOfTwoIsGiven {
	public boolean checkSumOfTwoIsGiven(int[] inputArray, int targetValue) {
		boolean sumIsTargetValue = false;
		for(int i=0; i<inputArray.length-1; i++) {
			if(inputArray[i] + inputArray[i+1] == targetValue) {
				System.out.println("Sum of elements of array at index position "+i+" and "+(i+1)+" gives the target value!");
				sumIsTargetValue = true;
			}
		}
		return sumIsTargetValue;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to have for integer array: ");
		int limitOfArray = sc.nextInt();
		System.out.println("Enter the elements one by one: ");
		int[] userInputArr = new int[limitOfArray];
		for(int i=0; i<userInputArr.length; i++) {
			userInputArr[i] = sc.nextInt();
		}
		System.out.println("Enter the target value: ");
		int userInputTargetVal = sc.nextInt();
		SumOfTwoIsGiven sat = new SumOfTwoIsGiven();
		if(sat.checkSumOfTwoIsGiven(userInputArr, userInputTargetVal)) {
			System.out.println("Does sum of any two elements give target value result? - Yes!");
		} else {
			System.out.println("Does sum of any two elements give target value result? - No!");
		}
		sc.close();

	}

}
