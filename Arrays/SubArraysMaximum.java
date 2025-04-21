package com.basic2.arrays;

import java.util.Scanner;

public class SubArraysMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("How many integers would you like to input?");
		    int n = s.nextInt();
			int ans = -100000;
			int acc = 0;
			System.out.println("Input the integers:");
			for (int i=0;i<n;i++) {
				acc += s.nextInt();
				ans = Math.max(ans, acc);
				if (acc < 0) acc = 0;
			}
			System.out.println("Maximum sum of the said contiguous subsequence:");
			System.out.println(ans);
			s.close();

	}

}
