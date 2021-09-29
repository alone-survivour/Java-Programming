package com.basic.strings;

import java.util.Scanner;

public class CaptalizeLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	     System.out.print("Input a Sentence: ");
		 String line = in.nextLine();
		 String upper_case_line = ""; 
	       Scanner lineScan = new Scanner(line); 
	         while(lineScan.hasNext()) {
	             String word = lineScan.next(); 
	             upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
	         }
	      System.out.println(upper_case_line.trim());
	      in.close();
	      lineScan.close();

	}

}
