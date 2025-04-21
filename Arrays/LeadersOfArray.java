package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeadersOfArray {
	public void getTheLeadersOfArray(int[] inputArray) {
		int maxGotTillNow = inputArray[inputArray.length - 1];
		System.out.println(maxGotTillNow);
		for(int i=inputArray.length-2; i>=0; i--) {
			if(inputArray[i] > maxGotTillNow) {
				System.out.println(inputArray[i]);
				maxGotTillNow = inputArray[i];
			}
		}
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
		LeadersOfArray loar = new LeadersOfArray();
		System.out.println("The leaders of given array "+Arrays.toString(UserInputArray)+" is \n");
		loar.getTheLeadersOfArray(UserInputArray);
		sc.close();
	}

}
