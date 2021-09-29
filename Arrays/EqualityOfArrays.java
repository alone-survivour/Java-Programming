package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualityOfArrays {
	public boolean checkEqualityOfArrays(int[] inputNums1, int[] inputNums2) {
		boolean isTwoArraysEqual = true;
		if(inputNums1.length == inputNums2.length) {
			for(int i=0; i<inputNums1.length; i++) {
				if(inputNums1[i] != inputNums2[i]) {
					isTwoArraysEqual = false;
				}
			}
		} else {
			isTwoArraysEqual = false;
		}
		return isTwoArraysEqual;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to have for first array: ");
		int limitOfArray1 = sc.nextInt();
		System.out.println("Enter the elements one by one: ");
		int[] userInputArr1 = new int[limitOfArray1];
		for(int i=0; i<userInputArr1.length; i++) {
			userInputArr1[i] = sc.nextInt();
		}
		System.out.println("How many elements you want to have for second array: ");
		int limitOfArray2 = sc.nextInt();
		System.out.println("Enter the elements one by one: ");
		int[] userInputArr2 = new int[limitOfArray2];
		for(int i=0; i<userInputArr2.length; i++) {
			userInputArr2[i] = sc.nextInt();
		}
		System.out.println("Given arrays are: "+Arrays.toString(userInputArr1)+" and "+Arrays.toString(userInputArr2));
		EqualityOfArrays eam = new EqualityOfArrays();
		if(eam.checkEqualityOfArrays(userInputArr1, userInputArr2)) {
			System.out.println(Arrays.toString(userInputArr1)+" and "+Arrays.toString(userInputArr2)+" are equal!");
		} else {
			System.out.println(Arrays.toString(userInputArr1)+" and "+Arrays.toString(userInputArr2)+" are not equal!");
		}
		sc.close();
	}

}
