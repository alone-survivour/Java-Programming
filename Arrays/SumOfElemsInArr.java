package com.exercises.arrays;

import java.util.Scanner;

public class SumOfElemsInArr {
	public void getElemsInArraySumZero(int[] inputArray) {
		String elementsSumToZero = "";
		for(int i=0; i<inputArray.length; i++) {
			for(int j=i+1; j<inputArray.length; j++) {
				if(Math.abs(inputArray[i]+inputArray[j])==1) {
					elementsSumToZero = elementsSumToZero + "["+inputArray[i]+","+inputArray[j]+"]"+" ";
				}
			}
		}
		System.out.println("Pairs of elements where the sum is closest to zero is: "+elementsSumToZero);
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
		SumOfElemsInArr semar = new SumOfElemsInArr();
		semar.getElemsInArraySumZero(UserInputArray);
		sc.close();
	}

}
