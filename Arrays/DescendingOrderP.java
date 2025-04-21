package com.basic2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrderP {
	public int[] generateDescOrder(String inputStr) {
		String[] strNumsForm = inputStr.split(" ");
		int[] intNumsForm = new int[strNumsForm.length];
		for(int i=0; i<strNumsForm.length; i++) {
			intNumsForm[i]=Integer.parseInt(strNumsForm[i]);
		}
		Arrays.sort(intNumsForm);
		int indexOfDescArr = 0;
		int[] DescArr = new int[intNumsForm.length];
		for(int j=intNumsForm.length-1; j>=0; j--) {
			DescArr[indexOfDescArr] = intNumsForm[j];
			indexOfDescArr++;
		}
		return DescArr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integers in space-seperated pattern: ");
		String userInput = in.nextLine();
		DescendingOrderP dp = new DescendingOrderP();
		System.out.println("Result: "+Arrays.toString(dp.generateDescOrder(userInput)));
		in.close();
	}

}
