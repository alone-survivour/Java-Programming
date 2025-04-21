package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopier {
	public void generateCopiesOfArray(int[] inputNumsArr, int numOfCopiesReq) {
		String arrayInStrForm = Arrays.toString(inputNumsArr);
		for(int i=1; i<=numOfCopiesReq; i++) {
			System.out.println(arrayInStrForm);
		}
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
		System.out.println("Enter the number of copies you want: ");
		int userInputCopiesReq = sc.nextInt();
		ArrayCopier ac = new ArrayCopier();
		ac.generateCopiesOfArray(userInputArr, userInputCopiesReq);
		sc.close();
	}

}
