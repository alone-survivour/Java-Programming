package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiffBwSmallLarge {
	public int getDiffBetweenSmallLargeUsingSort(int[] inputNums) {
		Arrays.sort(inputNums);
		int smallestNumInArr = inputNums[0];
		int largestNumInArr = inputNums[inputNums.length-1];
		int diffBetweenSmallAndLarge = largestNumInArr - smallestNumInArr;
		return diffBetweenSmallAndLarge;
	}
	
	public int getDiffBetweenSmallLargeWithoutSort(int[] inputNums) {
		int smallestNumInArr = inputNums[0];
		int largestNumInArr = inputNums[0];
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
		int diffBetweenLargeSmall = largestNumInArr - smallestNumInArr;
		return diffBetweenLargeSmall;
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
		DiffBwSmallLarge dm = new DiffBwSmallLarge();
		//System.out.println("Difference between smallest integer and largest integer of given array "+Arrays.toString(userInputArr)+" is "+dm.getDiffBetweenSmallLargeUsingSort(userInputArr));
		System.out.println("Difference between smallest integer and largest integer of given array "+Arrays.toString(userInputArr)+" is "+dm.getDiffBetweenSmallLargeWithoutSort(userInputArr));
		sc.close();

	}

}
