package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SegregateZerosAndOnes {
	public int[] segreateAllZerosAndOnes(int[] inputArray) {
		int countOnesInArr = 0;
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i] == 1) {
				countOnesInArr++;
			}
		}
		int[] allZerosAndOnesLeftRight = new int[inputArray.length];
		for(int j=countOnesInArr-1; j<allZerosAndOnesLeftRight.length; j++) {
			allZerosAndOnesLeftRight[j] = 1;
		}
		return allZerosAndOnesLeftRight;
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
		SegregateZerosAndOnes szao = new SegregateZerosAndOnes();
		System.out.println("Before segregating all zeros and ones in given array: "+Arrays.toString(UserInputArray));
		System.out.println("After segregating all zeros to left side and all ones to right side of array: "+Arrays.toString(szao.segreateAllZerosAndOnes(UserInputArray)));
		sc.close();

	}

}
