package com.exercises.conditionalStatements;

import java.util.Scanner;

public class FloatingDecimalsCheck {
	
	public double truncateTo(double value, int decimalPlaces) {
		int truncatedNumberInt=(int)(value*Math.pow(10, decimalPlaces));
		double truncatedNumber=(double)(truncatedNumberInt/Math.pow(10, decimalPlaces));
		return truncatedNumber;
	}
	
	public boolean checkFloatingPointsTwo(double inputNum1, double inputNum2) {
		boolean isEqualUptoTwoDecimals = false;
		double truncatedNumber1 = truncateTo(inputNum1, 2);
		double truncatedNumber2 = truncateTo(inputNum2, 2);
		if(truncatedNumber1 == truncatedNumber2) {
			isEqualUptoTwoDecimals = true;
		} else {
			isEqualUptoTwoDecimals = false;
		}
		return isEqualUptoTwoDecimals;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first double integer: ");
		double userInput1 = input.nextDouble();
		System.out.println("Enter second double integer: ");
		double userInput2 = input.nextDouble();
		FloatingDecimalsCheck fps = new FloatingDecimalsCheck();
		if(fps.checkFloatingPointsTwo(userInput1, userInput2)) {
			System.out.println("Given numbers are equal");
		} else {
			System.out.println("Given numbers are different");
		}
		input.close();
	}

}
