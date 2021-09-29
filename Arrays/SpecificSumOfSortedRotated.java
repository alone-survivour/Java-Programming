package com.exercises.arrays;

import java.util.Scanner;

public class SpecificSumOfSortedRotated {
	public boolean checkPairOfSumSortedArr(int[] inputArray, int targetSum) {
		int sizeOfArray = inputArray.length;
		for(int k=0; k<sizeOfArray-1; k++) {
			if(inputArray[k] > inputArray[k+1]) {
				break;
			}
			int l = (k+1)%sizeOfArray;
			int r = k;
			while (l != r) {
				if (inputArray[l] + inputArray[r] == targetSum)
	                  return true;
	             if (inputArray[l] + inputArray[r] < targetSum)
	                  l = (l + 1) % sizeOfArray;
	                   
	             else
	                  r = (sizeOfArray + r - 1) % sizeOfArray;
			}
		}
		return false;
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
		System.out.println("Enter the target value: ");
		int userInputTarget = sc.nextInt();
		SpecificSumOfSortedRotated ssmm = new SpecificSumOfSortedRotated();
		if(ssmm.checkPairOfSumSortedArr(UserInputArray, userInputTarget)) {
			System.out.println("Array has a pair of elements with sum "+userInputTarget);
		} else {
			System.out.println("Array does not have a pair of elements with sum "+userInputTarget);
		}
		sc.close();

	}

}
