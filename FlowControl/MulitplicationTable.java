package com.exercises.conditionalStatements;

import java.util.Scanner;

public class MulitplicationTable {
	public void generateMultiplicationTable(int Mulitplier, int inputMultiples) {
		for(int i=0; i<=inputMultiples; i++) {
			System.out.println(Mulitplier+" X "+i+" = "+Mulitplier*i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to geenrate multiplication table:");
		int userInputMultiplier = sc.nextInt();
		System.out.println("Enter the multiples to geenrate multiplication table:");
		int userInputMultiplies = sc.nextInt();
		MulitplicationTable mt = new MulitplicationTable();
		mt.generateMultiplicationTable(userInputMultiplier, userInputMultiplies);
		sc.close();
	}

}
