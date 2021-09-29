package com.exercises.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	//Ascending order
	public void sortArrUsingBubbleSortAlgo(int[] inputArr) {
		int lengthOfArray = inputArr.length;
		int countOfPasses = 0;
		for(int i=0; i<lengthOfArray-1; i++) {
			int flag = 0;
			for(int j=0; j<lengthOfArray-1-i; j++) {
				if(inputArr[j] > inputArr[j+1]) {
					int temp = inputArr[j];
					inputArr[j] = inputArr[j+1];
					inputArr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag==0) {
				break;
			} else {
				countOfPasses++;
			}
		}
		System.out.println("After sorting the array using bubble sort algorithm: "+Arrays.toString(inputArr));
		System.out.println("Number of times the array has been sorted: "+countOfPasses);
	}
	//Descending order
	public void sortArrUsingBubbleSortAlgo2(int[] inputArr) {
		int lengthOfArray = inputArr.length;
		int countOfPasses = 0;
		for(int i=0; i<lengthOfArray-1; i++) {
			int flag = 0;
			for(int j=0; j<lengthOfArray-1-i; j++) {
				if(inputArr[j] < inputArr[j+1]) {
					int temp = inputArr[j];
					inputArr[j] = inputArr[j+1];
					inputArr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag==0) {
				break;
			} else {
				countOfPasses++;
			}
		}
		System.out.println("After sorting the array using bubble sort algorithm: "+Arrays.toString(inputArr));
		System.out.println("Number of times the array has been sorted: "+countOfPasses);
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
		BubbleSort bs = new BubbleSort();
		//System.out.println("After sorting array using bubble sort algorithm: "+Arrays.toString(bs.sortArrUsingBubbleSortAlgo(userInputArr)));
		bs.sortArrUsingBubbleSortAlgo(userInputArr);
		//bs.sortArrUsingBubbleSortAlgo2(userInputArr);
		sc.close();
	}

}
