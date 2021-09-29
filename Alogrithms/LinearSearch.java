package com.exercises.searchingalgos;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	private void doSearchingWithLinear(int[] inputArr, int valueToSearch) {
		int elemFound = 0;
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i] == valueToSearch) {
				elemFound = 1;
				System.out.println(valueToSearch+" is at index "+i+" in given array "+Arrays.toString(inputArr));
				break;
			}
		}
		if(elemFound == 0) {
			System.out.println(valueToSearch+" is not present in given array "+Arrays.toString(inputArr));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int sizeOfUserInputArr = sc.nextInt();
		int[] userInputArr = new int[sizeOfUserInputArr];
		for(int i=0; i<sizeOfUserInputArr; i++) {
			System.out.println("Enter the element at: "+i);
			userInputArr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search ing above array: ");
		int userInputElem = sc.nextInt();
		LinearSearch ls = new LinearSearch();
		ls.doSearchingWithLinear(userInputArr, userInputElem);
		sc.close();
	}

}
