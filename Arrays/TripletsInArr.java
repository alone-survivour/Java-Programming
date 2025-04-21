package com.exercises.arrays;

import java.util.Scanner;

public class TripletsInArr {
	public void getUniqueTripletsFromArr(int[] inputArray, int targetVal) {
		for(int i=0; i<inputArray.length; i++) {
			for(int j=i; j<inputArray.length; j++) {
				for(int k=j; k<inputArray.length; k++) {
					if(i != j && j != k && i != k && (inputArray[i] + inputArray[j] + inputArray[k] == targetVal)) {
						System.out.println("Triplets that give sum of its elements is target value: "+"("+inputArray[i]+","+inputArray[j]+","+inputArray[k]+")");
					}
				}
			}
		}
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
		System.out.println("Enter the target value to check: ");
		int userInputTargetVal = sc.nextInt();
		TripletsInArr tar = new TripletsInArr();
		tar.getUniqueTripletsFromArr(userInputArr, userInputTargetVal);
		sc.close();
	}

}
