package com.basic2.numbers;

import java.util.Scanner;

public class NumtoStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int num = sc.nextInt();
		String convInt = Integer.toString(num);
		System.out.println(((Object)num).getClass().getName());
		System.out.println(num+" converted to string is: "+ convInt);
		System.out.println(convInt.getClass().getName());
		sc.close();
	}

}
