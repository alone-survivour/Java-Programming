package com.basic2.numbers;

import java.util.Scanner;

public class PowerOf2Check {
	public boolean checkNumPowerOFTwo(int givenNum) {
		boolean powerOfTwo = false;
		int actualNum = givenNum;
		int countTwoDivisibles = 0;
		while(actualNum!=0) {
			if(actualNum%2 == 0) {
				countTwoDivisibles++;
			}
			actualNum=actualNum/2;
		}
		int computdPowerVal = (int)Math.pow(2, countTwoDivisibles);
		if(computdPowerVal == givenNum) {
			powerOfTwo = true;
		}
		return powerOfTwo;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the positive integer: ");
		int givenNum = in.nextInt();
		PowerOf2Check p = new PowerOf2Check();
		if(p.checkNumPowerOFTwo(givenNum)) {
			System.out.println("Is given integer a power of 2? ---> True");
		} else {
			System.out.println("Is given integer a power of 2? ---> False");
		}
		in.close();
	}

}
