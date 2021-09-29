package com.exercises.sorting;
import java.util.Scanner;
import java.util.Arrays;
public class ShellSort{
	private static int[] doShellSorting(int[] arr){
		int n = arr.length;
		int gap = (int)(n/2);
		if(gap!=1){
			while(gap>0){
				int start = 0;
				int end = gap;
				while(end<=arr.length-1){
					if(arr[start] > arr[end]){
						int tmp = arr[start];
						arr[start] = arr[end];
						arr[end] = tmp;
					}
					start++;
					end++;
				}
				gap = (int)(gap/2);
			}
		} else {
			for(int i=1; i<arr.length; i++){
				int temp = arr[i];
				int j = i-1;
				while(j>=0  && arr[j]>temp){
					arr[j+1] = arr[j];
					j--;
				}
				arr[j+1] = temp;
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
		System.out.println("After sorting the array using shell sort algorithm: "+Arrays.toString(doShellSorting(userInputArr)));
		sc.close();
	}
}