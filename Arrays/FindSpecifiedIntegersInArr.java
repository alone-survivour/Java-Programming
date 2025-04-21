package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindSpecifiedIntegersInArr {
	public boolean checkSecifiedIntsInArr(int[] inputNums, int specifiedVal1, int specifiedVal2) {
		boolean foundSpecifiedValsInArr = false;
		for(int i=0; i<inputNums.length; i++) {
			if(inputNums[i] == specifiedVal1 || inputNums[i] == specifiedVal2) {
				foundSpecifiedValsInArr = true;
			}
		}
		return foundSpecifiedValsInArr;
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
		int userSpecifiedVal1 = 0;
		int userSpecifiedVal2 = -1;
		FindSpecifiedIntegersInArr fart = new FindSpecifiedIntegersInArr();
		if(fart.checkSecifiedIntsInArr(userInputArr, userSpecifiedVal1, userSpecifiedVal2)) {
			System.out.println(userSpecifiedVal1+" or "+userSpecifiedVal2+" are there in given array "+Arrays.toString(userInputArr));
		} else {
			System.out.println(userSpecifiedVal1+" or "+userSpecifiedVal2+" are not there in given array "+Arrays.toString(userInputArr));
		}
		sc.close();
	}

}
