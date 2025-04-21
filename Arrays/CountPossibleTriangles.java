package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountPossibleTriangles {
	public int countTrianglesFromElemsInArr(int[] inputArray) {
		Arrays.sort(inputArray);
		int countOfTriangles = 0;
		int sizeOfArray = inputArray.length;
		for(int i=0; i<sizeOfArray-2; i++) {
			int k = i+2;
			for(int j=i+1; j<sizeOfArray; j++) {
				while(k<sizeOfArray && inputArray[i] + inputArray[j] > inputArray[k]) {
					k++;
					if(k>j) {
						countOfTriangles = countOfTriangles + k-j-1;
					}
				}
			}
		}
		return countOfTriangles;
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
		CountPossibleTriangles ct = new CountPossibleTriangles();
		System.out.println("Number of triangles that can be formed from three sides of above given array "+Arrays.toString(UserInputArray)+" is "+ct.countTrianglesFromElemsInArr(UserInputArray));
		sc.close();

	}

}
