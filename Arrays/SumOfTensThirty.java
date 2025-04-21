package com.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTensThirty {
	public boolean getSumOfTensInArray(int[] inputArray) {
		boolean sumOfTensInArrayThirty = true;
		int countOfTensInArr = 0;
		int sumOfTensInArr = 0;
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i] == 10) {
				countOfTensInArr++;
				sumOfTensInArr = sumOfTensInArr + inputArray[i];
			}
		}
		if(countOfTensInArr != 3 && sumOfTensInArr != 30) {
			sumOfTensInArrayThirty = false;
		}
		return sumOfTensInArrayThirty;
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
		SumOfTensThirty soty = new SumOfTensThirty();
		if(soty.getSumOfTensInArray(userInputArr)) {
			System.out.println("Does sum of 10 "+"\'"+"s in given array "+Arrays.toString(userInputArr)+" gives 30? True");
		} else {
			System.out.println("Does sum of 10 "+"\'"+"s in given array "+Arrays.toString(userInputArr)+" gives 30? False");
		}
		sc.close();
	}
}
