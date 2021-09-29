package com.exercises.conditionalStatements;

import java.util.Scanner;

public class CheckGreatest {
	public int checkGreatest(int a, int b, int c) {
		if(a>b && a>c) {
			return a;
		} else if(b>a && b>c) {
			return b;
		} else {
			return c;
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
		CheckGreatest cg = new CheckGreatest();
		System.out.println("Greatest of "+userInputa+" ,"+userInputb+" ,and "+userInputc+" is: "+ cg.checkGreatest(userInputa, userInputb, userInputc));
		in.close();
	}

}
