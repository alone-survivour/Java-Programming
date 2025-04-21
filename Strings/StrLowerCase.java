package com.basic.strings;

import java.util.Scanner;

public class StrLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	     System.out.print("Input a String: ");
		 String line = in.nextLine();
		 line = line.toLowerCase();
		 System.out.println(line);
		 in.close();

	}

}
