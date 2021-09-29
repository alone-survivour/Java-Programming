package com.exercises.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	private static int[] doSelectionSorting(int[] arr) {
		int lengthOfArr = arr.length;
		for(int i=0; i<lengthOfArr-1; i++) {
			int min = i;
			for(int j=i+1; j<lengthOfArr; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			if(min!=i) {
				int tmp = arr[i];
				arr[i] = arr[min];
				arr[min] = tmp;
			}
		}
		return arr;
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
		System.out.println("After sorting the array using selection sort: "+Arrays.toString(doSelectionSorting(userInputArr)));
		sc.close();

	}

}
