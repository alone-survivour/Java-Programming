package com.exercises.conditionalStatements;

import java.util.Arrays;
import java.util.Scanner;

public class SumAvg5 {
	public int computeSumOfIntegers(int[] inputNums) {
		int SumOfNumbers = 0;
		for(int i=0; i<inputNums.length; i++) {
			SumOfNumbers = SumOfNumbers+inputNums[i];
		}
		return SumOfNumbers;
	}
	public float computeAvgOfIntegers(int[] inputNums) {
		int sumOfIntegers = computeSumOfIntegers(inputNums);
		int inputNumsLength = inputNums.length;
		float avgOfIntegers  = sumOfIntegers/inputNumsLength;
		return avgOfIntegers;
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int[] userInputNums = new int[5];
		System.out.println("Enter the elements one by one: ");
		for(int i=0; i<userInputNums.length; i++) {
			userInputNums[i] = sc.nextInt();
		}
		SumAvg5 sa = new SumAvg5();
		System.out.println("Average of "+userInputNums.length+" numbers "+Arrays.toString(userInputNums)+" is: "+sa.computeAvgOfIntegers(userInputNums));
		sc.close();
	}

}
