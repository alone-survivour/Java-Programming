package com.basic2.arrays;

public class ArrayInterchange {
	public void transposeArray(int[][] a) {
		int m = a.length;
		int n = a[0].length;
		int[][]modA = new int[n][m];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				 modA[j][i]=a[i][j];
			}
		}
		System.out.println("Elements in original array: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("Element at "+i+","+j+" is: "+a[i][j]);
			}
		}
		System.out.println("\n");
		System.out.println("Elements in transposed array: ");
		int m1 = modA.length;
		int n1 = modA[0].length;
		for(int i=0; i<m1; i++) {
			for(int j=0; j<n1; j++) {
				System.out.println("Element at "+i+","+j+" is: "+modA[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		//int[][] a = {{10,20,30},{40,50,60}};
		int[][] b = {{10,40},{20,50},{30,60}};
		ArrayInterchange ai = new ArrayInterchange();
		//ai.transposeArray(a);
		ai.transposeArray(b);
	}

}
