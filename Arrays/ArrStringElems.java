package com.basic.arrays;

import java.util.Arrays;

public class ArrStringElems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		String[] arr_string = new String[n];
		
	    for(int i = 0; i < n; i++)
	        arr_string[i] = String.valueOf(i);                                  
		 System.out.println("New Array: "+Arrays.toString(arr_string)); 
		 }

}
