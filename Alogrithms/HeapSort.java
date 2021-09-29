package com.exercises.sorting;

import java.util.Arrays;
import java.util.Scanner;
/**
insertHeap(arr, value){
	n = arr.length;
	int[] b = new int[n+1];
	int index = 0;
	for(int i=0; i<n+1; i++){
		b[index] = a[i];
		index++;
	}
	b[index] = value;
	i=n+1;
	while(i>1){
		parent = i/2;
		if(arr[parent] < arr[i]){
			swap(arr[parent], arr[i]);
			i=parent;
		} else {
			return;
		}
	}
}
**/
public class HeapSort{
	private static void maxHeapifyHeap(int[] arr, int lengthOfArr, int indexToStart){
		int largestNode = indexToStart;
		int leftChild = (2*indexToStart)+1;
		int rightChild = (2*indexToStart)+2;
		if((leftChild < lengthOfArr) && (arr[leftChild]>arr[largestNode])){
			largestNode = leftChild;
		}
		if((rightChild < lengthOfArr) && (arr[rightChild]>arr[largestNode])) {
			largestNode = rightChild;
		}
		
		if(largestNode != indexToStart){
			int tmp = arr[indexToStart];
			arr[indexToStart] = arr[largestNode];
			arr[largestNode] = tmp;
			maxHeapifyHeap(arr,lengthOfArr,largestNode);
		}
	}
	
	private static int[] doHeapSorting(int[] arr){
		int length = arr.length;
		for(int i=length/2-1; i>=0; i--){
			maxHeapifyHeap(arr, length, i);
		}
		for(int i=arr.length-1; i>=0; i--){
			int tmp = arr[0];
			arr[0] = arr[i];
			arr[i] = tmp;
			maxHeapifyHeap(arr, i, 0);
		}
		return arr;
	}
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int sizeOfArray = s.nextInt();
		int[] userInputArr = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++){
			System.out.println("Enter the element at position "+i+": ");
			userInputArr[i] = s.nextInt();
		}
		System.out.println("Before sorting the array: "+Arrays.toString(userInputArr));
		System.out.println("After sorting the array using heap sort: "+Arrays.toString(doHeapSorting(userInputArr)));
	}
}