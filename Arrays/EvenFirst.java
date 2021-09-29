package com.basic2.arrays;

import java.util.Arrays;

public class EvenFirst {
	public int[] getEvenOddOrder(int[] a) {
		int evenCount=0, oddCount=0, addCount=0, addCount1=0, addCount2=0;
		//counting the number of even nums and odd nums
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		//Creating subarrays from original array based on even and odd counts size
		int[] evenArr = new int[evenCount];
		int[] oddArr = new int[oddCount];
		for(int j=0; j<a.length; j++) {
			if(a[j]%2==0) {
				evenArr[addCount]=a[j];
				addCount++;
			}
		}
		for(int k=0; k<a.length; k++) {
			if(a[k]%2!=0) {
				oddArr[addCount1]=a[k];
				addCount1++;
			}
		}
		//Merging the above subarrays such that even array will be first and odd array will be last
		int[] c = new int[evenArr.length+oddArr.length];
		for(int i=0; i<evenArr.length; i++) {
			c[i] = evenArr[i];
			addCount2++;
		}
		for(int j=0; j<oddArr.length; j++) {
			c[addCount2++]=oddArr[j];
		}
		return c;
		
	}

	public static void main(String[] args) {
		int[] a = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
		EvenFirst ef = new EvenFirst();
		System.out.println("Original array: "+ Arrays.toString(a));
		System.out.println("Resultant array: "+ Arrays.toString(ef.getEvenOddOrder(a)));

	}

}
