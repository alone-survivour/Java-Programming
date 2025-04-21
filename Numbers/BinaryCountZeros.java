package com.basic2.numbers;

import java.util.Scanner;

public class BinaryCountZeros {
	public static String getBinary(int num) {
		String binaryNum = "";
		String revStr = "";
		while(num>=2) {
			int r = num%2;
			binaryNum = binaryNum + r;
			num = num/2;
		}
		binaryNum = binaryNum+num;
		char[] bits = binaryNum.toCharArray();
		for(int i=bits.length-1; i>=0; i--) {
			revStr = revStr + bits[i];
		}
		return revStr;
	}
	public int countZerosBinary(int num) {
		int countZeros = 0;
		String str = getBinary(num);
		char[] bits = str.toCharArray();
		for(int i=0; i<bits.length; i++) {
			if(bits[i] == '0') {
				countZeros++;
			}
		}
		return countZeros;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		BinaryCountZeros bz = new BinaryCountZeros();
		System.out.println("Binary form of "+num+" is: "+getBinary(num));
		System.out.println("Number of zeros present in "+getBinary(num)+" are: "+ bz.countZerosBinary(num));
		sc.close();

	}

}
