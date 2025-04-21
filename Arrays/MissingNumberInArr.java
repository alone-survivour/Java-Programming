package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberInArr {
	public int getMissingNumberInArr(int[] inputNums) {
		Arrays.sort(inputNums);
		int smallestNumInArr = inputNums[0];
		int largestNumInArr = inputNums[inputNums.length - 1];
		int sumOfElemsInArr = 0;
		int sumOfNumsFromSmallLarge = 0;
		for(int i=0; i<inputNums.length; i++) {
			sumOfElemsInArr = sumOfElemsInArr + inputNums[i];
		}
		for(int j=smallestNumInArr; j<=largestNumInArr; j++) {
			sumOfNumsFromSmallLarge = sumOfNumsFromSmallLarge + j;
		}
		int resultantMissingNumInArr = sumOfNumsFromSmallLarge - sumOfElemsInArr;
		return resultantMissingNumInArr;
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
		MissingNumberInArr m = new MissingNumberInArr();
		System.out.println("Missing number in given array "+Arrays.toString(userInputArr)+" is: "+m.getMissingNumberInArr(userInputArr));
		sc.close();
	}

}
