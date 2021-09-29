package com.basic2.arrays;

import java.util.Arrays;

public class SmallestKInts {
	public void getSmallestKInts(int[] a, int k) {
		System.out.println("Given Array: "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(k+ " smallest integers of above said array:\n");
		for(int i=0; i<k; i++) {
			System.out.println(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = {5,74,10,29,65,37,51,44,38,84,96};
		SmallestKInts sk =  new SmallestKInts();
		sk.getSmallestKInts(myArr, 2);

	}

}
