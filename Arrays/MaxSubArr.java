package com.basic2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArr {
	public void getMaxSubArr(int[] a, int k) {
		int start=0;
		int end = start+(k-1);
		while(end<a.length) {
			int[] result = new int[k];
			for(int i=start; i<end+1; i++) {
				result[i-start] = a[i];
			}
			String maxRes = "Maximum: ";
			int maxSubArr = result[0];
			for(int x=0; x<result.length; x++) {
				if(result[x]>maxSubArr) {
					maxSubArr = result[x];
				}
			}
			maxRes = maxRes+maxSubArr;
			System.out.println(Arrays.toString(result) + "--->"+ maxRes);
			start++;
			end++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to enter: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements one by one: ");
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of subarray: ");
		int x = sc.nextInt();
		MaxSubArr m1 = new MaxSubArr();
		m1.getMaxSubArr(a, x);
		sc.close();
	}

}
