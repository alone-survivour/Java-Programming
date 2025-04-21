package com.basic2.arrays;

import java.util.Scanner;

public class OrthogonalChecker {
	public boolean checkLinesOrtho(int[] P, int[] Q, int[] R, int[] S) {
		boolean linesGivenOrth = false;
		int x1 = P[0],y1 = P[1],x2 = Q[0],y2 = Q[1];
		int x3 = R[0],y3 = R[1],x4 = S[0],y4 = S[1];
		int slope1 = (y2 - y1)/(x2 - x1);
		int slope2 = (x4 - x3)/(y4 - y3);
		if(slope1 * slope2 == -1) {
			linesGivenOrth = true;
		}
		return linesGivenOrth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of all points arrays: ");
		int size = sc.nextInt();
		int[] P = new int[size];
		int[] Q = new int[size];
		int[] R = new int[size];
		int[] S = new int[size];
		System.out.println("Enter the elements one by one for P: ");
		for(int i=0; i<P.length; i++) {
			P[i]=sc.nextInt();
		}
		System.out.println("Enter the elements one by one for Q: ");
		for(int j=0; j<Q.length; j++) {
			Q[j]=sc.nextInt();
		}
		System.out.println("Enter the elements one by one for R: ");
		for(int k=0; k<R.length; k++) {
			R[k]=sc.nextInt();
		}
		System.out.println("Enter the elements one by one for S: ");
		for(int l=0; l<S.length; l++) {
			S[l]=sc.nextInt();
		}
		OrthogonalChecker o = new OrthogonalChecker();
		if(o.checkLinesOrtho(P, Q, R, S)) {
			System.out.println("Straight lines formed from above points are orthogonal to each other!");
		} else {
			System.out.println("Straight lines formed from above points are not orthogonal to each other!");
		}
		sc.close();
	}

}
