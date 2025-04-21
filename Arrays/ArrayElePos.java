package com.basic2.arrays;

public class ArrayElePos {
	public boolean getElemPosArr(int[][] a, int n) {
		boolean foundElem = false;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j] == n) {
					foundElem = true;
					System.out.println("("+i+","+j+")");
				} else {
					foundElem = false;
				}
			}
		}
		return foundElem;
	}

	public static void main(String[] args) {
		int[][] a = {{3,4,8},{6,5,3},{2,3,7}};
		int n=3;
		ArrayElePos ae = new ArrayElePos();
		if(ae.getElemPosArr(a, n)) {
			System.out.println(n+" found at: ");
		} else {
			System.out.println(n+" not found in array.");
		}
	}

}
