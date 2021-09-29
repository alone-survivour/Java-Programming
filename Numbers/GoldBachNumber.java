package com.basic2.numbers;

import java.util.Scanner;

public class GoldBachNumber {
	public int[] generatePrimes(int inputNum) {
		String primeNumsFound = "";
		for(int i=2; i<=inputNum; i++) {
			int countPrimes = 0;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					countPrimes++;
					break;
				}
			}
			if(countPrimes == 0) {
				primeNumsFound = primeNumsFound+i+" ";
			}
		}
		String[] primeNumsFoundArr = primeNumsFound.split(" ");
		int[] primesFoundInArr = new int[primeNumsFoundArr.length];
		for(int k=0; k<primeNumsFoundArr.length; k++) {
			primesFoundInArr[k] = Integer.parseInt(primeNumsFoundArr[k]);
		}
		return primesFoundInArr;
	}
	
	public int getCombinations(int inputNum) {
		int[] primesTillInput = generatePrimes(inputNum);
		int primesAddCombos = 0;
		if(inputNum < 4) {
			return 0;
		} else {
			for(int i=0; i<primesTillInput.length; i++) {
				for(int j=i; j<primesTillInput.length; j++) {
					if(primesTillInput[j] + primesTillInput[i] == inputNum) {
						primesAddCombos++;
					}
				}
			}
		}
		return primesAddCombos;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive integer to check: ");
		int userInput = sc.nextInt();
		sc.close();
		GoldBachNumber g = new GoldBachNumber();
		System.out.println("Number of possible combinations for given integer "+userInput+" to be a goldbach number is: "+ g.getCombinations(userInput));
	}
}
