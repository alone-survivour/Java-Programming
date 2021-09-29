package com.exercises.searchingalgos;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	private int doSearchWithBinary(int[] inputArr, int valueToSearch) {
		//int[] sortedArray = sortArrayUsingQS(inputArr);
		int leftValue = 0, rightValue = inputArr.length-1;
		int midValue = (leftValue + rightValue)/2;
		while(leftValue <= rightValue) {
			if(valueToSearch == inputArr[midValue]) {
				return midValue;
			} else if(valueToSearch < inputArr[midValue]) {
				rightValue = midValue - 1;
			} else {
				leftValue = midValue + 1;
			}
			midValue = (leftValue+rightValue)/2;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int sizeOfUserInputArr = sc.nextInt();
		int[] userInputArr = new int[sizeOfUserInputArr];
		for(int i=0; i<sizeOfUserInputArr; i++) {
			System.out.println("Enter the element at: "+i);
			userInputArr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search ing above array: ");
		int userInputElem = sc.nextInt();
		BinarySearch bs = new BinarySearch();
		int elemFoundInArray = bs.doSearchWithBinary(userInputArr, userInputElem);
		if(elemFoundInArray == -1) {
			System.out.println(userInputElem+" is not present in given array "+Arrays.toString(userInputArr));
		} else {
			System.out.println(userInputElem+" is at index "+elemFoundInArray+" of given array "+Arrays.toString(userInputArr));
		}
		sc.close();
	}
}
