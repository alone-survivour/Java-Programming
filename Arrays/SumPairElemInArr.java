package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumPairElemInArr {
	public String getPairOfElemsFromArr(int[] inputNums, int specificNum) {
		String pairsOfElementsFromArr = "";
		for(int i=0; i<inputNums.length; i++) {
			for(int j=i+1; j<inputNums.length; j++) {
				if(inputNums[i] + inputNums[j] == specificNum) {
					pairsOfElementsFromArr = pairsOfElementsFromArr + "("+inputNums[i]+","+inputNums[j]+")"+" ";
				}
			}
		}
		return pairsOfElementsFromArr;
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
		SumPairElemInArr sm = new SumPairElemInArr();
		System.out.println("Enter the specific number to check: ");
		int userInputSpecificNum = sc.nextInt();
		System.out.println("Given array: "+Arrays.toString(userInputArr));
		System.out.println("Given specific number: "+userInputSpecificNum);
		System.out.println("Pairs of sum of elements from above array that matches given specific number: "+sm.getPairOfElemsFromArr(userInputArr, userInputSpecificNum));
		sc.close();

	}

}
