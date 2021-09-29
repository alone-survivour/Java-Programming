package com.basic.numbers;

import java.util.Scanner;

public class CheckEO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 System.out.print("Input a number: ");
	     int n = in.nextInt(); 
	            if (n % 2 == 0) {
	                System.out.println(1); 
	               }
				else {
	                System.out.println(0); 
	              }
	           in.close();

	}

}
