package com.basic2.numbers;

import java.util.Scanner;

public class StriaghtLineFromParallel {
	public int getRegionsCount(int inputLines) {
		if(inputLines < 1) {
			return 0;
		} else {
			int n = inputLines;
			int result = ((n*(n+1))/2)+1;
			return result;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of non-parallel lines: ");
		int userInput = sc.nextInt();
		sc.close();
		StriaghtLineFromParallel sp = new StriaghtLineFromParallel();
		System.out.println("Number of regions formed from "+userInput+" non-parallel lines is/are: "+sp.getRegionsCount(userInput));
	}

}
