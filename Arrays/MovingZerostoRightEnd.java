package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MovingZerostoRightEnd {
	public int[] moveAllZerosInArrRight(int[] inputNums) {
		int movingElem = 0; //{4,5,0,7,1,0};
		for(int i=0; i<inputNums.length; i++) {
			if(inputNums[i] != 0) {
				inputNums[movingElem++]=inputNums[i];
			}
		}
		while(movingElem < inputNums.length) {
			inputNums[movingElem++]=0;
		}
		return inputNums;
	}
	
	public int[] moveAllZerosInArrLeft(int[] inputNums) {
		int counter = inputNums.length - 1;
		for(int i=inputNums.length - 1; i>=0; i--) {
			if(inputNums[i] != 0) {
				inputNums[counter] = inputNums[i];
				counter--;
			}
		}
		while(counter >= 0) {
			inputNums[counter] = 0;
			counter--;
		}
		return inputNums;
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
		MovingZerostoRightEnd mae = new MovingZerostoRightEnd();
		System.out.println("Given arrray: "+Arrays.toString(userInputArr));
		System.out.println("After moving the zeros to the right end: "+Arrays.toString(mae.moveAllZerosInArrRight(userInputArr)));
		System.out.println("After moving the zeros to the left end: "+Arrays.toString(mae.moveAllZerosInArrLeft(userInputArr)));
		sc.close();

	}

}
