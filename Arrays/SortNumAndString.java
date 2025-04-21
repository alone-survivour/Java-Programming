package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumAndString {
	public int[] sortIntArray(int[] inputNum) {
		Arrays.sort(inputNum);
		return inputNum;
	}
	
	public String[] sortStringArray(String[] inputString) {
		Arrays.sort(inputString);
		return inputString;
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
		System.out.println("How many elements you want to have for string array: ");
		int limitOfArray2 = sc.nextInt();
		System.out.println("Enter the elements one by one: ");
		String[] userInputStrArr = new String[limitOfArray2];
		for(int j=0; j<userInputStrArr.length; j++) {
			userInputStrArr[j] = sc.next();
		}
		SortNumAndString sscc = new SortNumAndString();
		System.out.println("Integer array before sorting: "+Arrays.toString(userInputArr));
		System.out.println("Integer array after sorting: "+Arrays.toString(sscc.sortIntArray(userInputArr)));
		System.out.println();
		System.out.println("String array before sorting: "+Arrays.toString(userInputStrArr));
		System.out.println("String array after sorting: "+Arrays.toString(sscc.sortStringArray(userInputStrArr)));
		sc.close();
	}

}
