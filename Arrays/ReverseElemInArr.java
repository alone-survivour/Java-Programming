package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElemInArr {
	public int[] getReversedArr(int[] inputNums) {
		int[] reversedArr = new int[inputNums.length];
		int indexOfreversedArr = 0;
		for(int i=reversedArr.length-1; i>=0; i--) {
			reversedArr[indexOfreversedArr] = inputNums[i];
			indexOfreversedArr++;
		}
		return reversedArr;
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
		ReverseElemInArr r = new ReverseElemInArr();
		System.out.println("Before reversing the elements: "+Arrays.toString(userInputArr));
		System.out.println("After reversing the elements: "+Arrays.toString(r.getReversedArr(userInputArr)));
		sc.close();
	}

}
