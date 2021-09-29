package com.basic2.numbers;

import java.util.Scanner;

public class SumCompute {
	public int getSumStrs(String s1, String s2) {
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		int result = num1+num2;
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = input.next();
		System.out.println("Enter the second string: ");
		String str2 = input.next();
		SumCompute sc = new SumCompute();
		System.out.println("\'"+str1+"\'" +" + "+"\'"+str2 +"\'"+ " = "+sc.getSumStrs(str1, str2));
		input.close();
	}

}
