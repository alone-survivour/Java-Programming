package com.exercises.conditionalStatements;

import java.util.Scanner;

public class IncreaseDecrease {
	public void checkInDec(int inputNum1, int inputNum2, int inputNum3) {
		if(inputNum1 < inputNum2 && inputNum2 < inputNum3) {
			System.out.println("Numbers are following increasing pattern!");
		} else if (inputNum1 > inputNum2 && inputNum2 > inputNum3) {
			System.out.println("Numbers are following decreasing pattern!");
		} else {
			System.out.println("Numbers are neither following increasing pattern nor decreasing pattern!");
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
		IncreaseDecrease id = new IncreaseDecrease();
		id.checkInDec(userInput1, userInput2, userInput3);
		s.close();

	}

}
