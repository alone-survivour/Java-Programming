package com.exercises.sorting;

import java.util.Arrays;
public class CombSort{
	private static int[] doCombSorting(int[] a){
		int n = (int)(a.length/1.3);
		while(n > 0){
			int start = 0;
			int end = n;
			while(end<=a.length-1){
				if(a[start] > a[end]){
					int tmp = a[start];
					a[start] = a[end];
					a[end] = tmp;
				}
				start++;
				end++;
			}
			n = (int)(n/1.3);
		}
		return a;
	}
	public static void main(String...args){
		int[] a = {8,4,1,56,3,-44,23,-6,28,0};
		System.out.println("Before sorting: "+Arrays.toString(a));
		System.out.println("After sorting: "+Arrays.toString(doCombSorting(a)));
	}
}