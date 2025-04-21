package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOperation {
	public int[] rearrage_int_array(int[] nums) {
		int n = nums.length;
		int temp[] = new int[n];
	     
        int small_num = 0, large_num = n-1;
        boolean flag = true;
    
       for (int i=0; i < n; i++)
       {
           if (flag)
               temp[i] = nums[large_num--];
           else
               temp[i] = nums[small_num++];
    
           flag = !flag;
       }
    
       return temp;
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
		SortArrayOperation ss = new SortArrayOperation();
		System.out.println("Original array: "+Arrays.toString(UserInputArray));
		System.out.println("After sorting: "+Arrays.toString(ss.rearrage_int_array(UserInputArray)));
		sc.close();
	}

}
