package com.basic2.arrays;

import java.util.Arrays;

public class PlusOne {
	public void getAddNum(int[] a) {
		String oldNumDigits = "";
		for(int i=0; i<a.length; i++) {
			oldNumDigits = oldNumDigits + a[i];
		}
		int oldNum = Integer.parseInt(oldNumDigits);
		int modifiedNum = oldNum+1;
		String modifiedNumStr = String.valueOf(modifiedNum);
		char[] modifiedNumDigits = modifiedNumStr.toCharArray();
		System.out.println("Result: "+ Arrays.toString(modifiedNumDigits));
	}
	
	public static void main(String[] args) {
		int[] a = {9,9,9,9};
		System.out.println("Original Array: "+ Arrays.toString(a));
		PlusOne p = new PlusOne();
		p.getAddNum(a);
	}

}
