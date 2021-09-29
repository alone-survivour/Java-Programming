package com.basic2.arrays;

import java.util.Arrays;

public class SmallestAndLargest {
	public void getSmallGreatKInts(int[] a, int k) {
		System.out.println("Given array:\n"+ Arrays.toString(a));
		System.out.println("\n");
		Arrays.sort(a);
		System.out.println(k+" smallest integers in above array: ");
		for(int i=0; i<k; i++) {
			System.out.println(a[i]+ " ");
		}
		System.out.println("\n");
		System.out.println(k+" largest integers in above array: ");
		for(int j=a.length-k; j<a.length; j++) {
			System.out.println(a[j]+ " ");
		}
	}

	public static void main(String[] args) {
		int[] myArr = {5,74,10,29,65,37,51,44,38,84,96};
		SmallestAndLargest sl = new SmallestAndLargest();
		sl.getSmallGreatKInts(myArr, 3);
	}

}
