package com.basic2.arrays;

public class ArrayPrimeCheck {
	public boolean checkPrime(int a) {
		boolean primeFound = false;
		if(a>0) {
			for(int i=2; i<a; i++) {
				if(a%i == 0) {
					primeFound = true;
					break;
				}
			}
		}
		return primeFound;
	}

	public static void main(String[] args) {
		int[][] a = {{17,18,19},{20,21,22},{23,24,29}};
		ArrayPrimeCheck ap = new ArrayPrimeCheck();
		for(int[] x: a) {
			for(int ele: x) {
				if(ap.checkPrime(ele)) {
					System.out.println(ele+" is not a prime number");
				} else {
					System.out.println(ele+" is a prime number");
				}
			}
		}

	}

}
