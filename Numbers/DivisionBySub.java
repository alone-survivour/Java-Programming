package com.basic2.numbers;

public class DivisionBySub {
	public int getDivisionBySub(int a, int b) {
		int count = 0;
		if(b==0) {
			return 0;
		}
		
		int signInt = -1;
		if(a<0 || b<0) {
			return (a/b)*signInt;
		}
		
		if(a>b) {
			while(a!=0) {
				int remainder = a-b;
				count = count+1;
				a = remainder;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 625;
		int b = 25;
		DivisionBySub db = new DivisionBySub();
		System.out.println(a+"/"+b+" = "+ db.getDivisionBySub(a, b));

	}

}
