package com.basic2.numbers;

import java.util.Scanner;

public class ComputeOper {
	public double getValue(int x, int y, int n) {
		double powerValue = Math.pow(x, n);
		double finalResValue = powerValue%y;
		return finalResValue;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = in.nextInt();
		System.out.println("Enter y: ");
		int y = in.nextInt();
		System.out.println("Enter n: ");
		int n = in.nextInt();
		ComputeOper c = new ComputeOper();
		System.out.println("Result: "+ c.getValue(x, y, n));
		in.close();
	}

}
