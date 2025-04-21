package com.basic2.numbers;

import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Input two integers:");
        String s1 = new String();
		String s2 = new String();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        BigInteger result = new BigInteger("0");
        result = result.add(b1);
        result = result.add(b2);
        String s3 = ""+result;
		System.out.println("\nSum of the said two integers:");
		if(s1.length()>80 || s2.length()>80 || s3.length()>80) {
			System.out.println("Overflow");
		} else {
			System.out.println(result);
		}
		sc.close();
	}

}
