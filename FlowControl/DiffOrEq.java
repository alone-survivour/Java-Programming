package com.exercises.conditionalStatements;

import java.util.Scanner;

public class DiffOrEq {
	public void checkNumbers(int inputNum1, int inputNum2, int inputNum3) {
		if(inputNum1 == inputNum2 && inputNum2==inputNum3 && inputNum3 == inputNum1) {
			System.out.println("All are equal");
		} else if (inputNum1 == inputNum2 || inputNum2==inputNum3 || inputNum3 == inputNum1) {
			System.out.println("Neither equal nor different");
		} else {
			System.out.println("All are different");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int userInput1 = s.nextInt();
		System.out.println("Enter second number: ");
		int userInput2 = s.nextInt();
		System.out.println("Enter third number: ");
		int userInput3 = s.nextInt();
		DiffOrEq d = new DiffOrEq();
		d.checkNumbers(userInput1, userInput2, userInput3);
		s.close();

	}

}
