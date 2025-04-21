package com.basic2.numbers;

import java.util.Scanner;

public class DoubleBtw0and1 {
	public boolean checkDouble(double d1, double d2) {
		if((d1>0.0) && (d1<1.0) && (d2>0.0) && (d2<1.0)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		double n1 = sc.nextDouble();
		System.out.println("Enter second integer: ");
		double n2 = sc.nextDouble();
		sc.close();
		DoubleBtw0and1 d = new DoubleBtw0and1();
		if(d.checkDouble(n1, n2)) {
			System.out.println("Given integers are strictly between 0 and 1");
		} else {
			System.out.println("Given integers are not strictly between 0 and 1");
		}

	}

}
