package com.exercises.arrays;

import java.util.Scanner;

public class AntiDiagonalsInArr {
	public void getAntiDiagonalsOfArr(int[][] inputArray) {
		System.out.println("Given matrix is: ");
		for(int i=0; i<inputArray.length; i++) {
			for(int j=0; j<inputArray[i].length; j++) {
				System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Anti-diagonal elements of above array: ");
		int antiDiagonalElems = (inputArray.length * 2) - 1;
		for(int i=0; i<antiDiagonalElems; i++) {
			for(int j=0; j<inputArray.length; j++) {
				for(int k=0; k<inputArray[j].length; k++) {
					if(j+k == i) {
						System.out.print(inputArray[j][k]+" ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rowsOfArray = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int colsOfArray = sc.nextInt();
		int[][] userInputArray = new int[rowsOfArray][colsOfArray];
		for(int i=0; i<userInputArray.length; i++) {
			for(int j=0; j<userInputArray[i].length; j++) {
				System.out.println("Enter the element at "+"["+i+"]"+"["+j+"] :");
				userInputArray[i][j] = sc.nextInt();
			}
		}
		AntiDiagonalsInArr adiar = new AntiDiagonalsInArr();
		adiar.getAntiDiagonalsOfArr(userInputArray);
		sc.close();
	}

}
