package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubSeqInArr {
	public static int longest_seq(int[] nums) {
		int max_sequ = 0;
		if (nums.length == 1) return 1;
		for (int i = 0; i < nums.length - 1; i++) {
			int ctr = 1;
			int j = i;
			if (nums[i + 1] > nums[i]) {
				while (j < nums.length - 1 && nums[j + 1] > nums[j]) {
					ctr++;
				    j++;
				}
			} else if (nums[i + 1] < nums[i]) {
				while (j < nums.length - 1 && nums[j + 1] < nums[j]) {
					ctr++;
				    j++;
				}
			}
			if (ctr > max_sequ) {
				max_sequ = ctr;
			}
			i += ctr - 2;
		}
		return max_sequ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to have for integer array: ");
		int limitOfArray = sc.nextInt();
		System.out.println("Enter the elements one by one: ");
		int[] userInputArr = new int[limitOfArray];
		for(int i=0; i<userInputArr.length; i++) {
			userInputArr[i] = sc.nextInt();
		}
		System.out.println("Given array: "+Arrays.toString(userInputArr));
		System.out.println("Longest sub-sequence in the above array: "+LongestSubSeqInArr.longest_seq(userInputArr));
		sc.close();
	}

}
