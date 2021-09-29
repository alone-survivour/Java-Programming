package com.basic2.numbers;

import java.util.Scanner;

public class SingleDigit {
	public int returnCount(int n) {
		int count=0;
		while(n!=0) {
			int r = n%10;
			count = count + r;
			n = n/10;
		}
		return count;
	}
	public int getSingleDig(int num) {
		int countGot = returnCount(num);
		if(countGot > 10) {
			countGot = returnCount(countGot);
		} else {
			return countGot;
		}
		return countGot;
	}

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("Enter any positive integer: ");
		int num = i.nextInt();
		SingleDigit s = new SingleDigit();
		i.close();
		System.out.println("After adding all digits of above number to single digit number gives: "+s.getSingleDig(num));

	}

}
