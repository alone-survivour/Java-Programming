package com.exercises.conditionalStatements;

import java.util.Arrays;
import java.util.Scanner;

public class OddNaturalsSum {
	public int generateOddNaturalsSum(int inputLimit) {
		int i=1, x=1;
		String str = "";
		while(i<=inputLimit) {
			str = str+x+" ";
			x=x+2;
			i++;
		}
		String[] result1 = str.split(" ");
		int[] result2 = new int[result1.length];
		for(int y=0; y<result2.length; y++) {
			result2[y]=Integer.parseInt(result1[y]);
		}
		System.out.println("Required array is: "+Arrays.toString(result2));
		int count=0;
		for(int z=0;z<result2.length; z++) {
			count = count + result2[z];
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int userInputLimit = sc.nextInt();
		OddNaturalsSum ods = new OddNaturalsSum();
		System.out.println("Sum of first "+userInputLimit+" odd natural numbers are: "+ods.generateOddNaturalsSum(userInputLimit));
		sc.close();
	}

}
