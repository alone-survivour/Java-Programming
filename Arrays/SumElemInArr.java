package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumElemInArr {
	public int getSumOfElemInArr(int[] inputNum) {
		int sumOfElemInArray = 0;
		for(int i=0; i<inputNum.length; i++) {
			sumOfElemInArray = sumOfElemInArray + inputNum[i];
		}
		return sumOfElemInArray;
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
		SumElemInArr sne = new SumElemInArr();
		System.out.println("Sum of elements in given array "+Arrays.toString(userInputArr)+" is: "+sne.getSumOfElemInArr(userInputArr));
		sc.close();
	}

}
