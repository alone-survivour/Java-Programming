package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeB4Positive {
	public void getSortedNumsOfGivenArr(int[] nums) {
		int pos_num = 0;
        int neg_num = 0;
        int i,j;
        int max = Integer.MIN_VALUE;
        for(i=0; i<nums.length; i++){
            if(nums[i]<0) neg_num++;
            else pos_num++;
            if(nums[i]>max) max = nums[i];
        }
        max++;
        if(neg_num==0 || pos_num == 0) return;
        i=0;
        j=1;
        while(true){
            while(i<=neg_num && nums[i]<0) i++;
            while(j<nums.length && nums[j]>=0) j++;
            if(i>neg_num || j>=nums.length) break;
            nums[i]+= max*(i+1);
            swap_nums(nums,i,j);
        }

        i = nums.length-1;
        while(i>=neg_num){
            int div = nums[i]/max;
            if(div == 0) i--;
            else{
                nums[i]%=max;
                swap_nums(nums,i,neg_num+div-2); 
            }
        }
        System.out.println("New array: "+Arrays.toString(nums));
	}
	
	private static void swap_nums(int[] nums, int i , int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int sizeOfUserInputArray = sc.nextInt();
		int[] UserInputArray = new int[sizeOfUserInputArray];
		for(int i=0; i<UserInputArray.length; i++) {
			System.out.println("Enter the element at index "+i+" : ");
			UserInputArray[i]=sc.nextInt();
		}
		NegativeB4Positive nb4p = new NegativeB4Positive();
		nb4p.getSortedNumsOfGivenArr(UserInputArray);
		sc.close();

	}

}
