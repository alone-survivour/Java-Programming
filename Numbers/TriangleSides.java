package com.basic2.numbers;

import java.util.Scanner;

public class TriangleSides {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side of triangle: ");
		int a = sc.nextInt();
		System.out.println("Enter second side of triangle: ");
		int b = sc.nextInt();
		System.out.println("Enter third side of triangle: ");
		int c = sc.nextInt();
		if((a==b && b!=c) || (b==c && c!=a) || (c==a && a!=b)) {
			System.out.println("Can above sides form a triangle? Yes! Isosceles triangle");
		} else if (a==b && b==c && c==a) {
			System.out.println("Can above sides form a triangle? Yes! Equilateral triangle");
		} else if((a!=b && b!=c && c!=a) && ((a+b)>c && (b+c)>a && (a+c)>b)) {
			System.out.println("Can above sides form a triangle? Yes! Scalene triangle");
		}
		sc.close();

	}

}
