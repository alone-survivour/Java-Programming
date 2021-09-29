package com.exercises.arrays;

import java.util.Scanner;

public class AddMatricesOfSameSize {
	public void getAdditionOfMatrices(int[][] inputNums1, int[][] inputNums2){
		int[][] resultantAdditionArr = new int[inputNums1.length][inputNums1[0].length];
		for(int i=0; i<resultantAdditionArr.length; i++) {
			for(int j=0; j<resultantAdditionArr[i].length; j++) {
				resultantAdditionArr[i][j] = inputNums1[i][j] + inputNums2[i][j];
			}
		}
		for(int k=0; k<resultantAdditionArr.length; k++) {
			for(int m=0; m<resultantAdditionArr[k].length; m++) {
				System.out.println(resultantAdditionArr[k][m]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to enter: ");
		int numberOfRows = sc.nextInt();
		System.out.println("Enter the number of columns you want to enter: ");
		int numberOfCols = sc.nextInt();
		int[][] userInputNums1 = new int[numberOfRows][numberOfCols];
		System.out.println("Enter the elements of first array one by one: ");
		for(int i=0; i<userInputNums1.length; i++) {
			for(int j=0; j<userInputNums1[i].length; j++) {
				userInputNums1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of second array one by one: ");
		int[][] userInputNums2 = new int[numberOfRows][numberOfCols];
		for(int i=0; i<userInputNums2.length; i++) {
			for(int j=0; j<userInputNums2[i].length; j++) {
				userInputNums2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix A:\n");
		for(int x=0; x<userInputNums1.length; x++) {
			for(int y=0; y<userInputNums1[x].length; y++) {
				System.out.println(userInputNums1[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix B:\n");
		for(int a=0; a<userInputNums2.length; a++) {
			for(int b=0; b<userInputNums2[a].length; b++) {
				System.out.println(userInputNums2[a][b]+" ");
			}
			System.out.println();
		}
		AddMatricesOfSameSize am = new AddMatricesOfSameSize();
		System.out.println("Addition of two matrices:\n");
		am.getAdditionOfMatrices(userInputNums1, userInputNums2);
		sc.close();
	}

}
