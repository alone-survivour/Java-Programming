package com.exercises.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
	private static int[] doCountSorting(int[] inputArr){
		int lengthOfArray = inputArr.length;
		int maxElemInArr = 0;
		for(int u=0; u<inputArr.length; u++){
			if(inputArr[u] > maxElemInArr){
				maxElemInArr = inputArr[u];
			}
		}
		int[] countArr = new int[maxElemInArr+1];
		int[] newArrAfterSort = new int[lengthOfArray];
		for(int x=0; x<inputArr.length; x++){
			if(inputArr[x] > maxElemInArr){
				maxElemInArr = inputArr[x];
			}
		}
		for(int d=0; d<countArr.length; d++){
			countArr[d] = 0;
		}
		for(int i=0; i<lengthOfArray; i++){
			countArr[inputArr[i]]++;
		}
		for(int j=1; j<=maxElemInArr; j++){
			countArr[j] = countArr[j] + countArr[j-1];
		}
		
		for(int k=lengthOfArray-1; k>=0; k--){
			newArrAfterSort[--countArr[inputArr[k]]] = inputArr[k];
		}
		
		for(int l=0; l<lengthOfArray; l++){
			inputArr[l] = newArrAfterSort[l];
		}
		return inputArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the input array: ");
		int sizeOfArray = sc.nextInt();
		int[] userInputArr = new int[sizeOfArray];
		for(int ele = 0; ele < sizeOfArray; ele++){
			System.out.println("Enter the element at position "+ele+" : ");
			userInputArr[ele] = sc.nextInt();
		}
		System.out.println("Before sorting the array: "+Arrays.toString(userInputArr));
		System.out.println("After sorting the array using counting sort algorithm: "+Arrays.toString(doCountSorting(userInputArr)));
		sc.close();
	}

}
