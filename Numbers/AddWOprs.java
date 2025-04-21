package com.basic.numbers;

import java.util.Scanner;

public class AddWOprs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y ;
		   Scanner in = new Scanner(System.in);	
		   System.out.print("Input first number: ");
		   x = in.nextInt(); 
		   System.out.print("Input second number: ");
		   y = in.nextInt();
		   in.close();
	      while(y != 0){
	            int carry = x & y;
	            x = x ^ y;
	            y = carry << 1;
	        }
	        System.out.print("Sum: "+x); 
			System.out.print("\n");

	}

}
