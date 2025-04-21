package com.exercises.conditionalStatements;

import java.util.Scanner;

public class FloatingPointExec {
	public void checkFloatingPointExe(double inputNum) {
		if(inputNum > 0) {
			if(inputNum < 1) {
				System.out.println("Positive small number");
			} else if(inputNum > 1000000) {
				System.out.println("Positive large number");
			} else {
				System.out.println("Positive number");
			}
		} else if(inputNum < 0) {
			if(Math.abs(inputNum) < 1) {
				System.out.println("Negative small number");
			} else if(Math.abs(inputNum) > 1000000) {
				System.out.println("Negative large number");
			} else {
				System.out.println("Negative number");
			}
		} else {
			System.out.println("Zero");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		double userInput = input.nextDouble();
		FloatingPointExec c = new FloatingPointExec();
		c.checkFloatingPointExe(userInput);
		input.close();
	}

}
