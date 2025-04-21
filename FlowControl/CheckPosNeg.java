package com.exercises.conditionalStatements;

import java.util.Scanner;

public class CheckPosNeg {
	public boolean checkNumPosNeg(int inputNum) {
		boolean isPositive = false;
		if(inputNum > 0) {
			isPositive = true;
		}
		return isPositive;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer to check: ");
		int userInputNum = input.nextInt();
		CheckPosNeg c = new CheckPosNeg();
		if(c.checkNumPosNeg(userInputNum)) {
			System.out.println("Is "+userInputNum+" a positive number? True");
		} else {
			System.out.println("Is "+userInputNum+" a positive number? False");
		}
		input.close();
	}

}
