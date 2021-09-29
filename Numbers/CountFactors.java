package com.basic.numbers;

import java.util.Scanner;

public class CountFactors {
	public static int result(int num) {	
		int ctr = 0;
        for(int i=1; i<=(int)Math.sqrt(num); i++) {
            if(num%i==0 && i*i!=num) {
                ctr+=2;
            } else if (i*i==num) {
                ctr++;
            }
        }
        return ctr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	      System.out.print("Input an integer: ");
	      int x = in.nextInt(); 

			System.out.println(result(x));
			in.close();
		 }

}
