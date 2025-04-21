package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementInArr {
	public int[] GetElementRemoval(int[] inputNumsArr, int elemToBeRemoved) {
		String elementsUnDeleted = "";
		for(int i=0; i<inputNumsArr.length; i++) {
			if(inputNumsArr[i] != elemToBeRemoved) {
				elementsUnDeleted = elementsUnDeleted + inputNumsArr[i] + " ";
			}
		}
		String[] elemUnremovedStrForm = elementsUnDeleted.split(" ");
		int[] elemUnremovedIntForm = new int[elemUnremovedStrForm.length];
		for(int j=0; j<elemUnremovedIntForm.length; j++) {
			elemUnremovedIntForm[j] = Integer.parseInt(elemUnremovedStrForm[j]);
		}
		return elemUnremovedIntForm;
	}
	
	public int[] GetElementRemoval2(int[] inputNumsArr, int elemToBeRemoved) {
		int countIfElemFound = 0;
		for(int i=0; i<inputNumsArr.length; i++) {
			if(inputNumsArr[i]==elemToBeRemoved) {
				for(int j=i; j<inputNumsArr.length-1; j++) {
					inputNumsArr[j] = inputNumsArr[j+1];
					inputNumsArr[j+1] = 0;
				}
				countIfElemFound++;
				break;
			}
		}
		if(countIfElemFound==0) {
			System.out.println("Element not found in the given array");
		} else {
			System.out.println("Element found in the given array");
		}
		return inputNumsArr;
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
		System.out.println("Enter the specific value you want to remove: ");
		int userInputSpecVal = sc.nextInt();
		RemoveElementInArr ram = new RemoveElementInArr();
		System.out.println("Before removing specified element "+userInputSpecVal+" : "+Arrays.toString(userInputArr));
		//System.out.println("After removing specified element "+userInputSpecVal+" : "+Arrays.toString(ram.GetElementRemoval(userInputArr, userInputSpecVal)));
		System.out.println("After removing specified element "+userInputSpecVal+" : "+Arrays.toString(ram.GetElementRemoval2(userInputArr, userInputSpecVal)));
		sc.close();
	}

}
