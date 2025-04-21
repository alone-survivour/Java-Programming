package com.basic2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MedianSubArr {
	public void getMedianArr(int[] a, int k) {
		int start=0;
		int end = start+(k-1);
		while(end<a.length) {
			int[] result = new int[k];
			for(int i=start; i<end+1; i++) {
				result[i-start] = a[i];
			}
			int subArrLen = result.length;
			String medianRes = "Median: ";
			if(subArrLen%2!=0) {
				medianRes = medianRes + result[((subArrLen+1)/2)-1];
			} else {
				int v1 = subArrLen/2;
				int v2 = (subArrLen/2)+1;
				medianRes = medianRes + result[v1-1]+","+result[v2-1];
			}
			
			System.out.println(Arrays.toString(result) + "--->"+ medianRes);
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
		MedianSubArr m = new MedianSubArr();
		m.getMedianArr(a, x);
		sc.close();

	}

}
