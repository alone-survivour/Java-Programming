package com.basic2.numbers;

import java.util.Scanner;

public class Power {
	public boolean checkPerfectSqr(int n) {
		boolean perSqr = false;
		for(int i=1; i<=n; i++) {
			if(n%i==0 && i*i==n) {
				perSqr = true;
			}
		}
		return perSqr;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int num = sc.nextInt();
		sc.close();
		Power p =new Power();
		if(p.checkPerfectSqr(num)) {
			System.out.println("Is the above number a perfect square?\nTrue!");
		} else {
			System.out.println("Is the above number a perfect square?\nFalse!");
		}
	}

}
