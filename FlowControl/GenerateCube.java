package com.exercises.conditionalStatements;

import java.util.Scanner;

public class GenerateCube {
	public void generateCube(int inputLimit) {
		int[] NonCubeNums = new int[inputLimit];
		int[] CubeNums= new int[inputLimit];
		for(int i=0; i<NonCubeNums.length; i++) {
			NonCubeNums[i]=i+1;
		}
		for(int j=0; j<CubeNums.length; j++) {
			CubeNums[j] = (int)Math.pow(NonCubeNums[j], 3);
		}
		
		for(int k=0; k<CubeNums.length; k++) {
			System.out.println("Cube of "+NonCubeNums[k]+" is: "+CubeNums[k]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int userInputTerms = sc.nextInt();
		GenerateCube g = new GenerateCube();
		g.generateCube(userInputTerms);
		sc.close();
	}

}
