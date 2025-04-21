package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AvgOfElemsArr {
	public double getAvgOfElemsInArray(int[] inputNumArr) {
		int sumOfElemInArr = 0;
		for(int i=0; i<inputNumArr.length; i++) {
			sumOfElemInArr = sumOfElemInArr + inputNumArr[i];
		}
		double avgOfElemInArr = sumOfElemInArr/inputNumArr.length;
		return avgOfElemInArr;
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
		AvgOfElemsArr ain = new AvgOfElemsArr();
		System.out.println("Average of elements present in array "+Arrays.toString(userInputArr)+" is: "+ain.getAvgOfElemsInArray(userInputArr));
		sc.close();

	}

}
