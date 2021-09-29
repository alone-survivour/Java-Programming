package com.basic.numbers;

import java.util.Scanner;

public class SumRes2 {
	public static boolean test(int p, int q, int r, boolean xyz)
    {
	   if(xyz)
		  return (r > q);
	   return (q > p && r > q);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
        int z = in.nextInt(); 
        System.out.print("The result is: "+test(x, y, z,true));
		System.out.print("\n");
		in.close();

	}

}
