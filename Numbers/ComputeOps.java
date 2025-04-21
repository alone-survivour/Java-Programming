package com.basic.numbers;

import java.util.Scanner;

public class ComputeOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ctr = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 1) {
		    System.out.println(n);
			if (n % 2 == 0) {
				n = n / 2;
				ctr += 1;
			}
			else {
				n = (3 * n + 1) / 2;
				ctr += 1;
			}
		}
		System.out.println(ctr);
		in.close();

	}

}
