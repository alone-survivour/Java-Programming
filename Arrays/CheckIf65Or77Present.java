package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIf65Or77Present {
	public boolean checkIfTwoSpecifiedElems(int[] inputArray, int specifiedVal1, int specifiedVal2) {
		boolean check65Or77InArr = false;
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i] == specifiedVal1 || inputArray[i] == specifiedVal2) {
				check65Or77InArr = true;
			}
		}
		return check65Or77InArr;
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
		int userSpecifiedVal1 = 65;
		int userSpecifiedVal2 = 77;
		CheckIf65Or77Present ckjihf = new CheckIf65Or77Present();
		if(ckjihf.checkIfTwoSpecifiedElems(userInputArr, userSpecifiedVal1, userSpecifiedVal2)) {
			System.out.println("Does "+userSpecifiedVal1+" and "+userSpecifiedVal2+" contain in given array "+Arrays.toString(userInputArr)+": True");
		} else {
			System.out.println("Does "+userSpecifiedVal1+" and "+userSpecifiedVal2+" contain in given array "+Arrays.toString(userInputArr)+": False");
		}
		sc.close();

	}

}
