package com.basic2.numbers;

import java.util.Scanner;

public class CheckAllEqual {
	public boolean checkNumsEqual(int a, int b, int c, int d) {
		if((a==b) && (b==c) && (c==d) && (d==a)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int n1 = sc.nextInt();
		System.out.println("Enter second integer: ");
		int n2 = sc.nextInt();
		System.out.println("Enter third integer: ");
		int n3 = sc.nextInt();
		System.out.println("Enter fourth integer: ");
		int n4 = sc.nextInt();
		sc.close();
		CheckAllEqual ceq = new CheckAllEqual();
		if(ceq.checkNumsEqual(n1, n2, n3, n4)) {
			System.out.println(n1+" , "+n2+" , "+n3+" , "+n4+" are equal!");
		} else {
			System.out.println(n1+" , "+n2+" , "+n3+" , "+n4+" are not equal!");
		}

	}

}
