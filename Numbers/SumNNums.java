package com.basic2.numbers;

import java.util.Scanner;

public class SumNNums {
	public long getSumNAturals(int n) {
		long result = ((n * (n+1))/2)*(1<<(n-1));
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		SumNNums sn = new SumNNums();
		System.out.println("Sum of elements of all possible sets from given set of "+n+" integers: "+ sn.getSumNAturals(n));
	}

}
