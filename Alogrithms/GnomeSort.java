package com.exercises.sorting;

import java.util.Arrays;
import java.util.Scanner;
public class GnomeSort{
	private static int[] doGnomeSorting(int[] a){
		int pos=0;
		while(pos<a.length){
			if(pos==0 || a[pos]>=a[pos-1]){
				pos = pos+1;
			} else {
				int tmp = a[pos];
				a[pos] = a[pos-1];
				a[pos-1] = tmp;
				pos = pos-1;
			}
		}
		return a;
	}
	public static void main(String...args){
		//int[] a = {3,8,7,9,5,10,2};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = s.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			System.out.println("Enter the value at position "+i+" : ");
			arr[i] = s.nextInt();
		}
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		System.out.println("After sorting using gnome sorting algorithm: "+Arrays.toString(doGnomeSorting(arr)));
	}
}