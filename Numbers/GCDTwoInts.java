package com.basic2.numbers;

import java.util.Scanner;

public class GCDTwoInts {
	public static int euclidGCD(int x, int y) {
		if(x==0 || y==0) {
			return 0;
		}
		
		if(x<y) {
			int t = x;
			x = y;
			y = t;
		}
		
		if(x%y==0) {
			return y;
		} else {
			return euclidGCD(y, x%y);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second integer: ");
		int n2 = sc.nextInt();
		sc.close();
		System.out.println("GCD of "+n1+" and "+n2+" is: "+euclidGCD(n1,n2));

	}

}
