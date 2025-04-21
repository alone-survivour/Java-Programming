package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinArr {
	public int getMaximumOfArray(int[] inputNums) {
		int maximumOfArr = inputNums[0];
		for(int i=0; i<inputNums.length; i++) {
			if(inputNums[i] > maximumOfArr) {
				maximumOfArr = inputNums[i];
			}
		}
		return maximumOfArr;
	}
	
	public int getMinimumOfArray(int[] inputNums) {
		int minOfArray = inputNums[0];
		for(int i=0; i<inputNums.length; i++) {
			if(inputNums[i] < minOfArray) {
				minOfArray = inputNums[i];
			}
		}
		return minOfArray;
	}
	
	public void getMaxandMinArr(int[] inputNums) {
		Arrays.sort(inputNums);
		int maximumEleInArray = inputNums[inputNums.length - 1];
		int minimumEleInArray = inputNums[0];
		System.out.println("Maximum element in given array "+Arrays.toString(inputNums)+" is "+maximumEleInArray+" and minimum element is "+minimumEleInArray);
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
		MaxAndMinArr m = new MaxAndMinArr();
		System.out.println("The maximum value of given array "+Arrays.toString(userInputArr)+" is "+m.getMaximumOfArray(userInputArr)+" and minimum value is "+m.getMinimumOfArray(userInputArr));
		//m.getMaxandMinArr(userInputArr);
		sc.close();
	}

}
