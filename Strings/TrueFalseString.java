package com.basic2.strings;

public class TrueFalseString {
	public void replaceBooleanValue(boolean[][] arr) {
		for(boolean[] x : arr) {
			for(boolean ele : x) {
				if(ele) {
					System.out.println("t");
				} else {
					System.out.println("f");
				}
			}
		}
	}

	public static void main(String[] args) {
		boolean[][] arrTake = {{true,false,true},{false,true,false}};
		TrueFalseString tf = new TrueFalseString();
		tf.replaceBooleanValue(arrTake);
	}

}
