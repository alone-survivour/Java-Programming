package com.basic2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeIndex {
	public int[] getPrimeRange(int min, int max) {
		String primeNums = "";
		for(int i=min; i<=max; i++) {
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
	
	public int getPrimeIndex(int num) {
		if(num<20) {
			int[] primeNums = getPrimeRange(2,20);
			System.out.println(num+" falls under the primes range "+Arrays.toString(primeNums));
			for(int i=0; i<primeNums.length; i++) {
				if(num==primeNums[i]) {
					return i;
				}
			}
		} else if (num>20 && num<100) {
			int[] primeNums = getPrimeRange(20,100);
			System.out.println(num+" falls under the primes range "+Arrays.toString(primeNums));
			for(int i=0; i<primeNums.length; i++) {
				if(num==primeNums[i]) {
					return i;
				}
			}
		} else if (num>100 && num<1000) {
			int[] primeNums = getPrimeRange(100,1000);
			System.out.println(num+" falls under the primes range "+Arrays.toString(primeNums));
			for(int i=0; i<primeNums.length; i++) {
				if(num==primeNums[i]) {
					return i;
				}
			}
		} else if(num>1000 && num<10000) {
			int[] primeNums = getPrimeRange(1000,10000);
			System.out.println(num+" falls under the primes range "+Arrays.toString(primeNums));
			for(int i=0; i<primeNums.length; i++) {
				if(num==primeNums[i]) {
					return i;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prime number to get the position: ");
		int num = sc.nextInt();
		PrimeIndex pi = new PrimeIndex();
		System.out.println(num+"\'s"+" position is at "+ pi.getPrimeIndex(num));
		sc.close();
	}

}
