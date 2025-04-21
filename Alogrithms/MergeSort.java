package com.exercises.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	private static void doMerging(int[] arr, int lb, int mid, int ub){
		int[] newArrAfterSort = new int[arr.length];
		int i = lb;
		int j = mid+1;
		int k = lb;
		while(i<=mid && j<=ub){
			if(arr[i] <= arr[j]){
				newArrAfterSort[k] = arr[i];
				i++;
			} else {
				newArrAfterSort[k] = arr[j];
				j++;
			}
			k++;
		}
		if(i>mid){
			while(j<=ub){
				newArrAfterSort[k] = arr[j];
				j++;
				k++;
			}
		} else {
			while(i<=mid){
				newArrAfterSort[k] = arr[i];
				i++;
				k++;
			}
		}
		for(int x=lb; x<=ub; x++){
			arr[x] = newArrAfterSort[x];
		}
	}
	private static int[] doMergeSorting(int[] arr, int lb, int ub){
		if(lb<ub){
			int mid = (lb+ub)/2;
			doMergeSorting(arr, lb, mid);
			doMergeSorting(arr, mid+1, ub);
			doMerging(arr, lb, mid, ub);
		}
		return arr;
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
		int lowerBound = 0;
		int upperBound = userInputArr.length-1;
		System.out.println("Before sorting the array: "+Arrays.toString(userInputArr));
		System.out.println("After sorting the array using merge sort: "+Arrays.toString(doMergeSorting(userInputArr,lowerBound,upperBound)));
		sc.close();
	}

}
