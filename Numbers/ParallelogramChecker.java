package com.basic2.numbers;

import java.util.Scanner;

public class ParallelogramChecker {
	public void getTypeOfParallelogram(String inputStr) {
		String[] numsInStrForm = inputStr.split(",");
		int[] numsInIntForm = new int[numsInStrForm.length];
		for(int i=0; i<numsInStrForm.length; i++) {
			numsInIntForm[i] = Integer.parseInt(numsInStrForm[i]);
		}
		if(numsInIntForm.length == 3) {
			int sideA = numsInIntForm[0];
			int sideB = numsInIntForm[1];
			int sideC = numsInIntForm[2];
			if(sideC*sideC == sideA*sideA + sideB*sideB) {
				System.out.println("This is a Rectangle!");
			} else if(sideA == sideB) {
				System.out.println("This is a Rhombus!");
			} else {
				System.out.println("Neither rhombus nor rectangle!");
			}
		} else {
			System.out.println("Only three inputs are considered!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two adjacent sides and a diagonal values with comma-seperated: ");
		String userInput = sc.nextLine();
		sc.close();
		ParallelogramChecker pc = new ParallelogramChecker();
		pc.getTypeOfParallelogram(userInput);
	}

}
