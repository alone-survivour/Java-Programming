package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GetIndexOfElem {
	public int getIndexOfElemInArr(int[] inputNumsArr, int specificVal) {
		int elemIndexFounded = 0;
		for(int i=0; i<inputNumsArr.length; i++) {
			if(inputNumsArr[i] == specificVal) {
				elemIndexFounded = i;
			}
		}
		return elemIndexFounded;
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
		System.out.println("Enter the specific value you want to search: ");
		int userInputSpecVal = sc.nextInt();
		GetIndexOfElem g = new GetIndexOfElem();
		System.out.println(userInputSpecVal+" is present at index "+g.getIndexOfElemInArr(userInputArr, userInputSpecVal)+" in given array "+Arrays.toString(userInputArr));
		sc.close();

	}

}
