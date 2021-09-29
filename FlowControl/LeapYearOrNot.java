package com.exercises.conditionalStatements;

import java.util.Scanner;

public class LeapYearOrNot {
	public boolean checkLeapYearOrNot(int inputYear) {
		boolean isLeapYear = false;
		if(inputYear%4 == 0) {
			if(inputYear%100 == 0) {
				if(inputYear%400 == 0) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}
			} else {
				isLeapYear = true;
			}
		} else {
			isLeapYear = false;
		}
		return isLeapYear;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check: ");
		int userGivenYear =sc.nextInt();
		LeapYearOrNot lp = new LeapYearOrNot();
		if(lp.checkLeapYearOrNot(userGivenYear)) {
			System.out.println(userGivenYear+" is a leap year!");
		} else {
			System.out.println(userGivenYear+" is not a leap year!");
		}
		sc.close();
	}
}
