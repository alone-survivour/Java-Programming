package com.exercises.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	private static int[] doInsertionSorting(int[] arr) {
		int lengthOfArr = arr.length;
		for(int i=1; i<lengthOfArr; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0  && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
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
		System.out.println("After sorting the array using insertion sort: "+Arrays.toString(doInsertionSorting(userInputArr)));
		sc.close();

	}

}
