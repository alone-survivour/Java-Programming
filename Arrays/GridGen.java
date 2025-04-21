package com.exercises.arrays;

import java.util.Scanner;

public class GridGen {
	public void generate(int inputRows, int inputCols) {
		if(inputRows == inputCols) {
			int[][] arrayFromAbove = new int[inputRows][inputCols];
			for(int i=0; i<arrayFromAbove.length; i++) {
				for(int j=0; j<=arrayFromAbove[i].length; j++) {
					System.out.print("-");
				}
				System.out.print("\n");
			}
		} else {
			System.out.println("This program will not be executed for inequal rows and columns!! Try again!!");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int userInputRows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int userInputCols= sc.nextInt();
		GridGen g = new GridGen();
		g.generate(userInputRows, userInputCols);
		sc.close();
	}

}
