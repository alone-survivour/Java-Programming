package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallAndSecondSmall {
	public String getSmallAndSecondSmall(int[] inputArray) {
		String smallAndSecondSmall = "";
		int smallestOfArr = Integer.MAX_VALUE;
		int secondSmallestOfArr = Integer.MAX_VALUE;
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i] < smallestOfArr) {
				smallestOfArr = inputArray[i];
			}
			
			if(inputArray[i] > smallestOfArr && inputArray[i] < secondSmallestOfArr) {
				secondSmallestOfArr = inputArray[i];
			}
		}
		smallAndSecondSmall = smallestOfArr+","+secondSmallestOfArr;
		return smallAndSecondSmall;
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
		SmallAndSecondSmall smasm = new SmallAndSecondSmall();
		System.out.println("Smallest and second smallest elements in given array "+Arrays.toString(UserInputArray)+"is "+smasm.getSmallAndSecondSmall(UserInputArray));
		sc.close();
		
	}

}
