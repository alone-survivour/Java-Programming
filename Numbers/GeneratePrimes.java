package com.basic2.numbers;

import java.util.Scanner;

public class GeneratePrimes {
	public int[] getPrimeRange(int max) {
		String primeNums = "";
		for(int i=2; i<=max; i++) {
			int count = 0;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				primeNums = primeNums+i+" ";
			}
		}
		String[] primeNumsArr = primeNums.split(" ");
		int[] primes = new int[primeNumsArr.length];
		for(int i=0; i<primeNumsArr.length; i++) {
			primes[i] = Integer.parseInt(primeNumsArr[i]);
		}
		return primes;
	}
	
	public int countPrimes(int num) {
		int[] primes = getPrimeRange(num);
		int count = primes.length;
		return count;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer to generate primes count: ");
		int num = sc.nextInt();
		GeneratePrimes g = new GeneratePrimes();
		System.out.println("Number of primes that are present less than or equal to 20: "+g.countPrimes(num));
		sc.close();
	}

}
