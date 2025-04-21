package com.basic2.numbers;

import java.util.Scanner;

public class RightAngleTr {
	public boolean checkSidesRAT(String inputStr) {
		boolean isSidesFormRAT = false;
		//Validation for white space chars
		int countNoSpaces = 0;
		for(int i=0; i<inputStr.length(); i++) {
			if(inputStr.charAt(i)==' ') {
				countNoSpaces++;
			}
		}
		//Validation for integers
		int countOfNums=0;
		String[] numsStrForm = inputStr.split(" ");
		int[] numsIntForm = new int[numsStrForm.length];
		int indexOfnumsIntForm = 0;
		for(int j=0; j<numsStrForm.length; j++) {
			numsIntForm[indexOfnumsIntForm]=Integer.parseInt(numsStrForm[j]);
			indexOfnumsIntForm++;
		}
		for(int x=0; x<numsIntForm.length; x++) {
			countOfNums++;
		}
		//Validation of positive integers only.
		int numsPositiveCount=0;
		for(int k=0; k<numsIntForm.length; k++) {
			if(numsIntForm[k]>=1 && numsIntForm[k]<=1000) {
				numsPositiveCount++;
			}
		}
		//Compute the result only if above validations are passed when user input is given
		if(countNoSpaces==2 && countOfNums==3 && numsPositiveCount==3) {
			int sideATr = numsIntForm[0];
			int sideBTr = numsIntForm[1];
			int sideCTr = numsIntForm[2];
			boolean resultA = (sideATr*sideATr + sideBTr*sideBTr == sideCTr*sideCTr)?true:false;
			boolean resultB = (sideCTr*sideCTr - sideBTr*sideBTr == sideATr*sideATr)?true:false;
			boolean resultC = (sideCTr*sideCTr - sideATr*sideATr == sideBTr*sideBTr)?true:false;
			if(resultA && resultB && resultC) {
				isSidesFormRAT=true;
			}
		}
		return isSidesFormRAT;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of triangle in space-seperated pattern: ");
		String userInput = sc.nextLine();
		RightAngleTr rat = new RightAngleTr();
		rat.checkSidesRAT(userInput);
		if(rat.checkSidesRAT(userInput)) {
			System.out.println("Yes! Given sides form right angled triangle!");
		} else {
			System.out.println("No! Given sides doesnt form right angled triangle!");
		}
		sc.close();
	}

}
