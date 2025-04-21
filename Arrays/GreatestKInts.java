package com.basic2.arrays;

import java.util.Arrays;

public class GreatestKInts {
	public void getGreatest(int[] a, int k) {
		System.out.println("Given array: "+Arrays.toString(a));
		Arrays.sort(a);
		int[] modA = new int[a.length];
		int j=0;
		//Creating descending order array from original array
		for(int i=a.length-1; i>=0; i--) {
			modA[j] = a[i];
			j++;
		}
		//Printing greatest integers
		System.out.println(k+" greatest integers in the above said array:\n");
		for(int x=0; x<k; x++) {
			System.out.println(modA[x]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = {5,74,10,29,65,37,51,44,38,84,96};
		GreatestKInts gki = new GreatestKInts();
		gki.getGreatest(myArr, 3);

	}

}
