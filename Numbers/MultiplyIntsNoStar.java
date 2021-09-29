package com.basic2.numbers;

import java.util.Scanner;

public class MultiplyIntsNoStar {
	public int getMulRes(int a, int b) {
		int result = 0;
		if(a==0 || b==0) {
			return 0;
		}
		if(a<b) {
			for(int i=1; i<=a; i++) {
				result += b;
			}
		}
		if(b<a) {
			
			for(int i=1; i<=b; i++) {
				result += a;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second integer: ");
		int num2 = sc.nextInt();
		sc.close();
		MultiplyIntsNoStar msr = new MultiplyIntsNoStar();
		System.out.println("Multiplication of "+num1+","+num2+" is: "+ msr.getMulRes(num1, num2));

	}

}
