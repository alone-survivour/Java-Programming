package com.basic2.arrays;

public class SmallerThanInt {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		int[] nums = {3,2,6};
		for(int i=0; i<nums.length; i++) {
			int[] result = new int[nums[i]-1];
			for(int j=0; j<nums[i]-1; j++) {
				result[j] = a[j];
			}
			System.out.println(result.length);
		}

	}

}
