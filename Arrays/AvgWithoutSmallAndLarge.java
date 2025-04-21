package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AvgWithoutSmallAndLarge {
	public float getAvgOfElemWithoutSmallLargeElems(int[] inputNums) {
		int smallestNumInArr = inputNums[0];
		int largestNumInArr = inputNums[0];
		int indexOfNewArr = 0;
		int[] newArrFormedFromOriginal = new int[inputNums.length - 2];
		for(int i=1; i<inputNums.length; i++) {
			if(inputNums[i] < smallestNumInArr) {
				smallestNumInArr = inputNums[i];
			}
		}
		for(int i=1; i<inputNums.length; i++) {
			if(inputNums[i] > largestNumInArr) {
				largestNumInArr = inputNums[i];
			}
		}
		for(int j=0; j<inputNums.length; j++) {
			if(inputNums[j] != smallestNumInArr && inputNums[j] != largestNumInArr) {
				newArrFormedFromOriginal[indexOfNewArr] = inputNums[j];
				indexOfNewArr++;
			}
		}
		int sumOfElemsWoLargeSmall = 0;
		for(int k=0; k<newArrFormedFromOriginal.length; k++) {
			sumOfElemsWoLargeSmall = sumOfElemsWoLargeSmall + newArrFormedFromOriginal[k];
		}
		float avgOfElemWoSmallLarge = ((sumOfElemsWoLargeSmall)/(newArrFormedFromOriginal.length));
		return avgOfElemWoSmallLarge;
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
		AvgWithoutSmallAndLarge awsml = new AvgWithoutSmallAndLarge();
		System.out.printf("Average of elements without smallest and largest element in given array "+Arrays.toString(userInputArr)+" is: %.2f", awsml.getAvgOfElemWithoutSmallLargeElems(userInputArr));
		sc.close();

	}

}
