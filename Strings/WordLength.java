package com.basic2.strings;
import java.util.Scanner;
public class WordLength {
	public int calcLenLastWord(String s) {
		int len_word = 0;
		String[] words = s.split(" ");
		if(words.length > 0) {
			len_word = words[words.length-1].length();
		} else {
			len_word = 0;
		}
		return len_word;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = input.nextLine();
		WordLength w = new WordLength();
		System.out.println("The length of last word in above string is: "+ w.calcLenLastWord(s));
		input.close();
	}

}
