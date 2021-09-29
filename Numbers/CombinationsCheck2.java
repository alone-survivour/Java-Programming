package com.basic2.numbers;

import java.util.Scanner;

public class CombinationsCheck2 {
	public static int comnum(int i, int n, int s,int p) {
        if(s == p && n == 0) {
            return 1;
        }
        if(i >= 10) {
            return 0;
        }
        if(n < 0) {
            return 0;
        }
 
        if(p > s) {
            return 0;
        }
        int c1 = comnum(i+1,n-1,s,p+i);
        int c2 = comnum(i+1,n,s,p);
        return c1+c2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Input number of combinations and sum (separated by a space in a line):"); 
        int n = stdIn.nextInt();
        int s = stdIn.nextInt();
        stdIn.close();
        int c1 = comnum(0, n, s,0);
		System.out.println("Number of combinations:");
        System.out.println(c1);
	}
}
