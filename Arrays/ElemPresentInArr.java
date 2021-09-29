package com.exercises.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ElemPresentInArr {
	public boolean checkElemInArr(int[] inputArr, int SpecificValue) {
		boolean hasSpecificValue = false;
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i] == SpecificValue) {
				hasSpecificValue = true;
			} else {
				continue;
			}
		}
		return hasSpecificValue;
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
		System.out.println("Enter the specific value you want to search: ");
		int userInputSpecVal = sc.nextInt();
		ElemPresentInArr eam = new ElemPresentInArr();
		if(eam.checkElemInArr(userInputArr, userInputSpecVal)) {
			System.out.println(userInputSpecVal+" is present in given array "+Arrays.toString(userInputArr));
		} else {
			System.out.println(userInputSpecVal+" is not present in given array "+Arrays.toString(userInputArr));
		}
		sc.close();
	}

}
