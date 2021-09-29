package com.basic.strings;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	     System.out.print("\nInput a word: ");
		 String word = in.nextLine();
		 word = word.trim();
		 String result = ""; 
	     char[] ch=word.toCharArray();  
		 for (int i = ch.length - 1; i >= 0; i--) {
				 result += ch[i];
			 }
		 System.out.println("Reverse word: "+result.trim());
		 in.close();

	}

}
