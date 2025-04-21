package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestInt {
	public int getSecondHighestOfArr(int[] inputNums) {
		int highestOfArr = Integer.MIN_VALUE;
		int secondHighestOfArr = Integer.MIN_VALUE;
		for(int i=0; i<inputNums.length; i++) {
			if(inputNums[i] > highestOfArr) {
				secondHighestOfArr = highestOfArr;
				highestOfArr = inputNums[i];
			}
			
			if(inputNums[i] < highestOfArr && inputNums[i] > secondHighestOfArr) {
				secondHighestOfArr = inputNums[i];
			}
		}
		return secondHighestOfArr;
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
		SecondLargestInt s = new SecondLargestInt();
		System.out.println("The second highest element of given array: "+Arrays.toString(userInputArr)+" is: "+s.getSecondHighestOfArr(userInputArr));
		sc.close();
	}

}
