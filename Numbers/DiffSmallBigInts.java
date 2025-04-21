package com.basic2.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class DiffSmallBigInts {
	public int calcDiff(int inputNum) {
		String IntToString = String.valueOf(inputNum);
		char[] NumToDigits = IntToString.toCharArray();
		int[] StringToInteger = new int[NumToDigits.length];
		for(int i=0; i<NumToDigits.length; i++) {
			StringToInteger[i]=Character.getNumericValue(NumToDigits[i]);
		}
		Arrays.sort(StringToInteger);
		int[] StringToIntegerDesc = new int[StringToInteger.length];
		int indexOfStringToIntegerDesc = 0;
		for(int j=StringToInteger.length-1; j>=0; j--) {
			StringToIntegerDesc[indexOfStringToIntegerDesc]=StringToInteger[j];
			indexOfStringToIntegerDesc++;
		}
		String IntegerAscDigits = "";
		String IntegerDescDigits = "";
		for(int k=0; k<StringToInteger.length; k++) {
			IntegerAscDigits = IntegerAscDigits + StringToInteger[k];
		}
		for(int l=0; l<StringToIntegerDesc.length; l++) {
			IntegerDescDigits = IntegerDescDigits+StringToIntegerDesc[l];
		}
		int SmallInteger = Integer.parseInt(IntegerAscDigits);
		int LargeInteger = Integer.parseInt(IntegerDescDigits);
		int diffBwLargeIntegerSmallInteger = LargeInteger - SmallInteger;
		
		return diffBwLargeIntegerSmallInteger;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integer value having range 0 to 9: ");
		int userInput = input.nextInt();
		DiffSmallBigInts dsb = new DiffSmallBigInts();
		System.out.println("The difference between largest integer and smallest integer formed from above integer is: "+dsb.calcDiff(userInput));
		input.close();
	}

}
