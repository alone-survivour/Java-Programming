package com.exercises.conditionalStatements;

import java.util.Scanner;

public class NumberChecker {
	public void checkNumber(int inputNumbeer) {
		if(inputNumbeer > 0) {
			System.out.println(inputNumbeer + " is a positive number!");
		} else if(inputNumbeer == 0) {
			System.out.println(inputNumbeer + " is neither negative nor positive number!");
		} else {
			System.out.println(inputNumbeer + " is a negative number!");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int userInputNum = sc.nextInt();
		NumberChecker n = new NumberChecker();
		n.checkNumber(userInputNum);
		sc.close();

	}

}
