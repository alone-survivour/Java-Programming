package com.basic.arrays;

import java.util.ArrayList;

public class ContSubArrSum2 {
	public static int min_SubArray(ArrayList<Integer> nums) { 
		   int[] nums1 = new int[nums.size()];
		        nums1[0] = nums.get(0);
		        int min = nums1[0];
		        for (int i = 1; i < nums.size(); ++i) {
		            nums1[i] = Math.min(nums.get(i), nums.get(i) + nums1[i - 1]);
		            min = Math.min(min, nums1[i]);
		        }
		        return min;
		 }
	
	public static void main(String[] args) {
	     ArrayList<Integer> nums = new ArrayList<Integer>();
	      nums.add(-2);
	      nums.add(1);
	      nums.add(-3);
	      nums.add(4);
	      System.out.print(min_SubArray(nums)); 
	}
}