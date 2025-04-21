package com.exercises.conditionalStatements;

import java.util.Scanner;

public class QuadraticEquationSolver {
	public void getRootsOfQE(int a, int b, int c) {
		double determinant = (b*b)-(4*a*c);
		if(determinant > 0) {
			double sqrt_determinant = Math.sqrt(determinant);
			double first_root = (-b + sqrt_determinant)/(2*a);
			double second_root = (-b - sqrt_determinant)/(2*a);
			System.out.println("Roots are real and distinct:\n");
			System.out.print("Roots are: "+first_root+", "+second_root);
		} else if(determinant == 0) {
			double sqrt_determinant = Math.sqrt(determinant);
			double single_root = (-b+sqrt_determinant)/(2*a);
			System.out.println("Roots are real and equal:\n");
			System.out.print("Root is: "+single_root);
		} else {
			System.out.println("Roots are complex and real");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a: ");
		int userInputa = in.nextInt();
		System.out.println("Enter b: ");
		int userInputb = in.nextInt();
		System.out.println("Enter c: ");
		int userInputc = in.nextInt();
		QuadraticEquationSolver qes = new QuadraticEquationSolver();
		qes.getRootsOfQE(userInputa, userInputb, userInputc);
		in.close();
	}

}
