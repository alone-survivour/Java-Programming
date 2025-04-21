package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElemsInThreeArrs {
	public String getCommonElemsFromThreeArrays(int[] inputNums1, int[] inputNums2, int[] inputNums3) {
		String commonElementsInThreeArrs = "";
		for(int i=0; i<inputNums1.length; i++) {
			for(int j=0; j<inputNums2.length; j++) {
				for(int k=0; k<inputNums3.length; k++) {
					if(inputNums1[i]==inputNums2[j] && inputNums2[j]==inputNums3[k] && inputNums3[k]==inputNums1[i]) {
						commonElementsInThreeArrs = commonElementsInThreeArrs + inputNums1[i]+ " ";
					}
				}
			}
		}
		return commonElementsInThreeArrs;
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
		System.out.println("How many elements you want to have for third integer array: ");
		int limitOfArray3 = sc.nextInt();
		System.out.println("Enter the elements one by one: ");
		int[] userInputArr3 = new int[limitOfArray3];
		for(int i=0; i<userInputArr3.length; i++) {
			userInputArr3[i] = sc.nextInt();
		}
		CommonElemsInThreeArrs car = new CommonElemsInThreeArrs();
		System.out.println("Common elements in three arrays "+Arrays.toString(userInputArr1)+", "+Arrays.toString(userInputArr2)+", and "+Arrays.toString(userInputArr3)+" is: "+car.getCommonElemsFromThreeArrays(userInputArr1, userInputArr2, userInputArr3));
		sc.close();
	}

}
