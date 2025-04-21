package com.basic.arrays;

import java.util.Scanner;

public class Elem4Or7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many elements you want to enter: ");
		int n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements: ");
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		boolean res = ((a[0]==4 | a[1]==4) | (a[1]==7 | a[1]==7)) ? true:false;
		if(res) {
			System.out.println("true!");
		} else {
			System.out.println("false!");
		}
		in.close();
	}

}
