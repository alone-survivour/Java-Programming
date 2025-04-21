package com.exercises.arrays;

import java.util.Scanner;

public class SumOfFourGivenTarget {
	public void getFourElemsOfArr(int[] inputArray, int targetVal) {
		int size = inputArray.length;
		String fourElemsInArr = "";
		for(int i=0; i<size-3; i++) {
			for(int j=i+1; j<size-2; j++) {
				for(int k=j+1; k<size-1; k++) {
					for(int l=k+1; l<size; l++) {
						if(inputArray[i]+inputArray[j]+inputArray[k]+inputArray[l] == targetVal) {
							fourElemsInArr = fourElemsInArr + "["+inputArray[i] + ","+ inputArray[j] + "," +inputArray[k] + "," + inputArray[l]+"]"+" ";
						}
					}
				}
			}
		}
		System.out.println("Required output: "+fourElemsInArr);
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
		int userGivenTargetVal = sc.nextInt();
		SumOfFourGivenTarget smt = new SumOfFourGivenTarget();
		smt.getFourElemsOfArr(UserInputArray, userGivenTargetVal);
		sc.close();

	}

}
