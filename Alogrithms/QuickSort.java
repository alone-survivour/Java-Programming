package com.exercises.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	private static int[] doQuickSorting(int[] inputArr, int leftPos, int rightPos) {
		int indexOfPartitionedArr = doPartitioningArray(inputArr, leftPos, rightPos);
		if(leftPos < indexOfPartitionedArr - 1) {
			doQuickSorting(inputArr, leftPos, indexOfPartitionedArr - 1);
		}
		if(indexOfPartitionedArr < rightPos) {
			doQuickSorting(inputArr, indexOfPartitionedArr, rightPos);
		}
		return inputArr;
	}
	private static int doPartitioningArray(int[] inputArr, int leftPos, int rightPos) {
		int pivotElem = inputArr[(leftPos+rightPos) / 2];
		while(leftPos <= rightPos) {
			while(inputArr[leftPos] < pivotElem) leftPos++;
			while(pivotElem < inputArr[rightPos]) rightPos--;
			if(leftPos <= rightPos) {
				int temp = inputArr[leftPos];
				inputArr[leftPos] = inputArr[rightPos];
				inputArr[rightPos] = temp;
				
				leftPos++;
				rightPos--;
			}
		}
		return leftPos;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of input array: ");
		int sizeOfArray = sc.nextInt();
		int[] userInputArr = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++) {
			System.out.println("Enter the element at "+i+" : ");
			userInputArr[i] = sc.nextInt();
		}
		System.out.println("Before sorting: "+Arrays.toString(userInputArr));
		System.out.println("After sorting the array using quick sort: "+Arrays.toString(doQuickSorting(userInputArr, 0, userInputArr.length - 1)));
		//doQuickSorting(userInputArr, 0, userInputArr.length - 1);
		sc.close();
	}

}
