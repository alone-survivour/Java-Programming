package com.basic2.numbers;

import java.util.Scanner;

public class PrimeNumGenSum {
	public int getNPrimes(int inputNum) {
		int SumNPrimes = 0;
		String primeNumsFound = "";
		for(int i=2; i<=10000; i++) {
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
		
		for(int l=0; l<inputNum; l++) {
			SumNPrimes = SumNPrimes + primesFoundInArr[l];
		}
		return SumNPrimes;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integer to generate sum of primes: ");
		int userInput = input.nextInt();
		PrimeNumGenSum obj = new PrimeNumGenSum();
		System.out.println("Sum of first "+userInput+" primes is: "+obj.getNPrimes(userInput));
		input.close();
	}

}
