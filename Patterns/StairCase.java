package com.basic.patterns;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
	       System.out.print("Input a positive integer: ");
	        int n = in.nextInt();
	        in.close();
			if (n>0)
			{
	           System.out.println("Number of rows: "+((int)((Math.sqrt(8 * (long)n + 1) - 1) / 2)));	
			}

	}

}
