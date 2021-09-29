package com.exercises.sorting;

import java.util.Arrays;
import java.util.Scanner;
public class PanCakeSort{
	private static int findMax(int[] a, int n){
		int mi, i;
        for (mi = 0, i = 0; i < n; ++i)
            if (a[i] > a[mi])
                mi = i;
        return mi;
	}
	private static void flip(int[] a, int i){
		int temp, start = 0;
        while (start < i) {
            temp = a[start];
            a[start] = a[i];
            a[i] = temp;
            start++;
            i--;
        }
	}
	private int[] doPancakeSort(int[] a, int n){
		for(int curr_size = n; curr_size>1; curr_size--){
			int mi = findMax(a, curr_size);
			if (mi != curr_size - 1) {
                // To move at the end, first move maximum
                // number to beginning
                flip(a, mi);
                // Now move the maximum number to end by
                // reversing current array
                flip(a, curr_size - 1);
            }
		}
		return a;
	}
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = s.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			System.out.println("Enter the value at position "+i+" : ");
			arr[i] = s.nextInt();
		}
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		PanCakeSort pcs = new PanCakeSort();
		System.out.println("After soring the array using pancake algorithm "+Arrays.toString(pcs.doPancakeSort(arr, arr.length)));
	}
}