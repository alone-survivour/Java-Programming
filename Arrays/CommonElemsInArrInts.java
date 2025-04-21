package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElemsInArrInts {
	public String getCommonElemsInIntArrs(int[] inputNums1, int[] inputNums2) {
		String commonElemsInIntArr = "";
		for(int i=0; i<inputNums1.length; i++) {
			for(int j=0; j<inputNums2.length; j++) {
				if(inputNums1[i] == inputNums2[j]) {
					commonElemsInIntArr = commonElemsInIntArr + inputNums1[i] + " ";
				}
			}
		}
		return commonElemsInIntArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to have for first integer array: ");
		int limitOfArray1 = sc.nextInt();
		System.out.println("Enter the elements one by one: ");
		int[] userInputArr1 = new int[limitOfArray1];
		for(int i=0; i<userInputArr1.length; i++) {
			userInputArr1[i] = sc.nextInt();
		}
		System.out.println("How many elements you want to have for second integer array: ");
		int limitOfArray2 = sc.nextInt();
		System.out.println("Enter the elements one by one: ");
		int[] userInputArr2 = new int[limitOfArray2];
		for(int i=0; i<userInputArr2.length; i++) {
			userInputArr2[i] = sc.nextInt();
		}
		CommonElemsInArrInts c = new CommonElemsInArrInts();
		System.out.println("Common elements in given arrays "+Arrays.toString(userInputArr1)+" and "+Arrays.toString(userInputArr2)+" are: "+c.getCommonElemsInIntArrs(userInputArr1, userInputArr2).trim());
		sc.close();
	}

}
