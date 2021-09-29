package com.basic2.numbers;

import java.util.Scanner;

public class LogarithmicCompute {
	public int getLogarithmic(double a) {
		double result = (Math.log10(a)/Math.log10(2));
		return (int)result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer to check: ");
		double n = sc.nextDouble();
		LogarithmicCompute lc = new LogarithmicCompute();
		int result = lc.getLogarithmic(n);
		System.out.println("Original number: "+n);
		System.out.println("Value of log "+n+" to base 2: "+result);
		sc.close();

	}

}
