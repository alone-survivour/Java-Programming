package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenCountInArr {
	public void getCountOfEvenOddInArr(int[] inputArray) {
		int countOfEvenIntsInArr = 0;
		int countOfOddIntsInArr = 0;
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i]%2 == 0) {
				countOfEvenIntsInArr++;
			} else {
				countOfOddIntsInArr++;
			}
		}
		System.out.println("Number of even integers in given array "+Arrays.toString(inputArray)+" are "+countOfEvenIntsInArr+" and odd integers are "+countOfOddIntsInArr);
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
		OddEvenCountInArr odevin = new OddEvenCountInArr();
		odevin.getCountOfEvenOddInArr(userInputArr);
		sc.close();

	}

}
