package com.basic2.arrays;

import java.util.Arrays;

public class GrThanAvg {
	public String getGrThAvg(int[] a) {
		System.out.println("Given Array:\n"+Arrays.toString(a));
		Arrays.sort(a);
		int sumEleArr = 0;
		for(int i=0; i<a.length; i++) {
			sumEleArr = sumEleArr + a[i];
		}
		double avgArr = sumEleArr/a.length;
		String GrtThn25 = "";
		for(int i=0; i<a.length; i++) {
			if(a[i] > avgArr) {
				GrtThn25 = GrtThn25+a[i]+" ";
			}
		}
		return GrtThn25;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = {5,74,10,29,65,37,51,44,38,84,96};
		GrThanAvg gta = new GrThanAvg();
		String result = gta.getGrThAvg(myArr);
		System.out.println("Elements that are greater than Average of array elements are: "+ result);
	}

}
