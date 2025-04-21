package com.basic2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AvgSubArr {
	public void computeAvgSubArr(int[] a, int k) {
		int start=0;
		int end = start+(k-1);
		while(end<a.length) {
			int[] result = new int[k];
			for(int i=start; i<end+1; i++) {
				result[i-start] = a[i];
			}
			int avgSubArrEle = 0;
			for(int x=0; x<result.length; x++) {
				avgSubArrEle = avgSubArrEle + result[x];
			}
			avgSubArrEle = avgSubArrEle/k;
			System.out.println(Arrays.toString(result) + "--->"+ avgSubArrEle);
			start++;
			end++;
		}
	}
	public double getAvgSubArrEle(int[] a, int k) {
		int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        int max_val = sum;
        for (int i = k; i < a.length; i++) {
            sum = sum - a[i - k] + a[i];
            max_val = Math.max(max_val, sum);
        }
        return (double) max_val / k;
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
		AvgSubArr ar = new AvgSubArr();
		System.out.println("Average: "+ ar.getAvgSubArrEle(a, x));
		sc.close();
	}

}
