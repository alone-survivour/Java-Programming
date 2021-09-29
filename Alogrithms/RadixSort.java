package com.exercises.sorting;
import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
	private static int getMaxOfArr(int[] arr){
		int maxElem = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] > maxElem){
				maxElem = arr[i];
			}
		}
		return maxElem;
	}
	
	private static int[] doCountingSort(int[] arr, int pos){
		int[] countArr = new int[10];
		int[] newArrAfterSort = new int[arr.length];
		for(int d=0; d<countArr.length; d++){
			countArr[d] = 0;
		}
		for(int i=0; i<arr.length; i++){
			++countArr[(arr[i]/pos)%10];
		}
		for(int j=1; j<countArr.length; j++){
			countArr[j] = countArr[j] + countArr[j-1];
		}
		for(int k=arr.length-1; k>=0; k--){
			newArrAfterSort[--countArr[(arr[k]/pos)%10]] = arr[k];
		}
		
		for(int l=0; l<newArrAfterSort.length; l++){
			arr[l] = newArrAfterSort[l];
		}
		return arr;
	}
	
	private static void doRedixSortingArr(int[] arr){
		int maxElemOfArr = getMaxOfArr(arr);
		for(int pos=1; (maxElemOfArr/pos)>0; pos*=10){
			doCountingSort(arr, pos);
		}
		System.out.println("After sorting the array using radix sort: "+Arrays.toString(arr));
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
		doRedixSortingArr(userInputArr);
		sc.close();
	}
}
