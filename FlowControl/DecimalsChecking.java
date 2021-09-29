package com.exercises.conditionalStatements;

import java.util.Scanner;

public class DecimalsChecking {
	public double truncateTo(double value, int decimalPlaces) {
		int truncatedNumberInt=(int)(value*Math.pow(10, decimalPlaces));
		double truncatedNumber=(double)(truncatedNumberInt/Math.pow(10, decimalPlaces));
		return truncatedNumber;
	}
	public boolean checkFloatingPointDecimals(double a, double b, int decimals) {
		boolean isDifferent = true;
		double truncatedNumber1 = truncateTo(a, decimals);
		double truncatedNumber2 = truncateTo(b, decimals);
		if(truncatedNumber1==truncatedNumber2) {
			isDifferent=false;
		}
		return isDifferent;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first value: ");
		double userInput1 = input.nextDouble();
		System.out.println("Enter second value: ");
		double userInput2 = input.nextDouble();
		System.out.println("Enter decimals to check: ");
		int userInputDecimals = input.nextInt();
		DecimalsChecking d = new DecimalsChecking();
		if(d.checkFloatingPointDecimals(userInput1, userInput2, userInputDecimals)) {
			System.out.println("They are different");
		} else {
			System.out.println("They are similar");
		}
		input.close();
	}

}
