package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestIntArr {
	public int getSecondSmallestOfArr(int[] inputNums) {
		int smallestOfArr = Integer.MAX_VALUE;
		int secondSmallestOfArr = Integer.MAX_VALUE;
		for(int i=0; i<inputNums.length; i++) {
			if(inputNums[i] < smallestOfArr) {
				smallestOfArr = inputNums[i];
			}
			
			if(inputNums[i] > smallestOfArr && inputNums[i] < secondSmallestOfArr) {
				secondSmallestOfArr = inputNums[i];
			}
		}
		return secondSmallestOfArr;
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
		SecondSmallestIntArr s2 = new SecondSmallestIntArr();
		System.out.println("Second smallest element in given array "+Arrays.toString(userInputArr)+" is "+s2.getSecondSmallestOfArr(userInputArr));
		sc.close();
	}

}
