package com.basic.numbers;

import java.util.Scanner;

public class RightDig {
	public static boolean test_last_digit(int p, int q, int r, boolean xyz)
    {
	     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
        int z = in.nextInt(); 
        System.out.print("The result is: "+test_last_digit(x, y, z,true));
		System.out.print("\n");
		in.close();

	}

}
