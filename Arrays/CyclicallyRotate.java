package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicallyRotate {
	public int[] getArrayAfterRotation(int[] inputArray) {
		int lastElemInArr = inputArray[inputArray.length - 1];
		int[] newArrayFormedAfterRotation = new int[inputArray.length];
		int indexOfnewArrayFormedAfterRotation = 1;
		for(int i=0; i<=inputArray.length-2; i++) {
			newArrayFormedAfterRotation[indexOfnewArrayFormedAfterRotation] = inputArray[i];
			indexOfnewArrayFormedAfterRotation++;
		}
		newArrayFormedAfterRotation[0] = lastElemInArr;
		return newArrayFormedAfterRotation;
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
		CyclicallyRotate crt = new CyclicallyRotate();
		System.out.println("Before rotation: "+Arrays.toString(UserInputArray));
		System.out.println("After rotation: "+Arrays.toString(crt.getArrayAfterRotation(UserInputArray)));
		sc.close();

	}

}
