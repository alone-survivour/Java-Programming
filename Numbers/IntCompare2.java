package com.basic.numbers;

import java.util.Scanner;

public class IntCompare2 {
	public static int result(int x, int y)
    {  
	if(x == y)
		return 0;
	    if(x % 6 == y % 6)
		    return (x < y) ? x : y;
	    return (x > y) ? x : y;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		System.out.println("Result: "+result(a, b));
		in.close();
	}

}
