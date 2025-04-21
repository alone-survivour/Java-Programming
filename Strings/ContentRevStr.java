package com.basic2.strings;

import java.util.Scanner;

public class ContentRevStr {
	public String revConStr(String s) {
		String modStr = "";
		String[] words = s.split(" ");
		for(int i=words.length-1; i>=0; i--) {
			modStr = modStr  + words[i]+" ";
		}
		return modStr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string with one space gap: ");
		String str = sc.nextLine();
		sc.close();
		ContentRevStr cr = new ContentRevStr();
		System.out.println("Original String: "+ str);
		System.out.println("Reveresed string: "+ cr.revConStr(str));

	}

}
