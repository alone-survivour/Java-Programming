package com.basic2.arrays;

import java.util.Arrays;

public class PositiveNegative {
	public void getPosNeg(int[] a) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = {5,-4,1,-3,2,4,1,-1,0};
		PositiveNegative pn = new PositiveNegative();
		pn.getPosNeg(myArr);

	}

}
