package com.basic2.arrays;

public class ContSubArrs {
	public void checkSubArr(int[] a, int k) {
		int countSubArr = 0;
		String subArrs = "";
		for(int i=0; i<a.length-1; i++) {
			if(a[i]+a[i+1]==k) {
				countSubArr++;
				subArrs = subArrs + "["+a[i]+","+a[i+1]+"]"+", ";
			}
		}
		System.out.println("Count of contiguous subarrays where sum of its elements give the given integer: "+ countSubArr);
		System.out.println("Arrays are: "+subArrs);
	}

	public static void main(String[] args) {
		int[] a = {4,5,7,1,3,6,1,8};
		ContSubArrs c = new ContSubArrs();
		c.checkSubArr(a, 9);

	}

}
