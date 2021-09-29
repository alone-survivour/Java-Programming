package com.basic2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZerosMoveArr {
	
	private void swapNums(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	
	public int[] moveZeros(int[] nums) {
		boolean swap = true;
		while(swap) {
			swap = false;
			for(int i=0; i<nums.length-1; i++) {
				if(nums[i]==0 && nums[i+1]!=0) {
					swapNums(nums, i, i+1);
					swap = true;
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to enter: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before moving zeros to right side: "+ Arrays.toString(a));
		ZerosMoveArr za = new ZerosMoveArr();
		za.moveZeros(a);
		System.out.println("After moving zeros to right side: "+ Arrays.toString(a));
		sc.close();

	}

}
