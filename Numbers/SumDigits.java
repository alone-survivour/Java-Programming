package com.basic.numbers;

import java.util.Scanner;

public class SumDigits {
	public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        long n = input.nextLong();
        input.close();
        System.out.println("The sum of the digits is: " + sumDigits(n));

	}

}
