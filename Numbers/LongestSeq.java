package com.basic2.numbers;

import java.util.Arrays;

public class LongestSeq {
	public int long_seq(int[] nums) {
		boolean flag = false;
		int result=0, start=0, end=0;
		for(int i=1; i<nums.length; i++) {
			if(nums[i-1]<nums[i]) {
				end=i;
			} else {
				start=i;
			}
			
			if(end-start > result){
				flag=true;
				result = end - start;
			}
		}
		if(flag) {
			return result + 1;
		} else {
			return result;
		}
	}

	public static void main(String[] args) {
		int[] a = {1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};
		LongestSeq ls = new LongestSeq();
		System.out.println("Original array: "+ Arrays.toString(a));
		System.out.println("Length of longest sequence in the above array: "+ ls.long_seq(a));
	}

}
