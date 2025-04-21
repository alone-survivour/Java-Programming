package com.exercises.arrays;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrToArrL {
	public void getArrayListFromArr(int[] inputNums) {
		List<int[]> arrayListFromInput = Arrays.asList(inputNums);
		System.out.println(arrayListFromInput);
		
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
		ArrToArrL al = new ArrToArrL();
		System.out.println("Original Array:\n"+Arrays.toString(userInputArr));
		System.out.println("After converting it to ArrayList:\n");
		al.getArrayListFromArr(userInputArr);
		sc.close();

	}

}
