package com.exercises.conditionalStatements;

import java.util.Scanner;

public class DigitsCount {
	public int countDigitsInNum(int inputNum) {
		int tempNum = inputNum;
		int countDigitsInNum = 0;
		while(tempNum != 0) {
			int remainder = tempNum%10;
			if(remainder >= 0) {
				countDigitsInNum = countDigitsInNum + 1;
			}
			tempNum = tempNum/10;
		}
		return countDigitsInNum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to count the digits: ");
		int userInputNum = sc.nextInt();
		DigitsCount dc = new DigitsCount();
		System.out.println("No. of digits present in "+userInputNum+" is: "+dc.countDigitsInNum(userInputNum));
		sc.close();

	}

}
