package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElemInArr {
	public int[] getNewArrayAfterInsertion(int[] inputNumsArr, int positionToInsert, int elemToInsert) {
		int[] newInputNumsArr = new int[inputNumsArr.length+1];
		for(int i=0; i<newInputNumsArr.length; i++) {
			if(i==positionToInsert) {
				for(int j=positionToInsert; j<=newInputNumsArr.length-1; j++) {
					newInputNumsArr[j] = inputNumsArr[j-1];
				}
				newInputNumsArr[positionToInsert]=elemToInsert;
			} else {
				for(int k=0; k<positionToInsert; k++) {
					newInputNumsArr[k]=inputNumsArr[k];
				}
			}
		}
		return newInputNumsArr;
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
		System.out.println("Enter the postion at which you want to enter element: ");
		int userGivenPosition = sc.nextInt();
		System.out.println("Enter the element at which you want to enter at the above position: ");
		int userGivenElem = sc.nextInt();
		System.out.println("Before inserting "+userGivenElem+" at "+userGivenPosition+ " is: "+Arrays.toString(userInputArr));
		InsertElemInArr obj = new InsertElemInArr();
		System.out.println("After inserting "+userGivenElem+" at "+userGivenPosition+" is: "+Arrays.toString(obj.getNewArrayAfterInsertion(userInputArr, userGivenPosition, userGivenElem)));
		sc.close();
	}
}
