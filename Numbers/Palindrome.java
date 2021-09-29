package com.basic.numbers;

import java.util.Scanner;

public class Palindrome {
	private static boolean palindrome(int num) {
        String str = String.valueOf(num);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
        Scanner in = new Scanner(System.in);	
        System.out.print("Input a positive integer: ");
        int n = in.nextInt(); 
        in.close();
        System.out.printf("Is %d is a palindrome number?\n",n);
		System.out.println(palindrome(n));

	}

}
