package com.basic2.strings;

import java.util.Scanner;

public class SecContainsFir {
	public boolean checkSecondHasFirst(String str1, String str2) {
		boolean ans=false;
		for(int i=0; i<str2.length()-1; i++) {
			if(str2.charAt(i) == str1.charAt(0)) {
				for (int j = 0; j < str1.length(); j++) {
					if ((i + j) < str2.length() && str1.charAt(j) == str2.charAt(i + j) && j == str1.length() - 1) {
						ans = true;
			            break;
					}
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter second String: ");
		String s2 = sc.nextLine();
		sc.close();
		SecContainsFir scr = new SecContainsFir();
		if(scr.checkSecondHasFirst(s1, s2)) {
			System.out.println("if second string contains first? true");
		} else {
			System.out.println("if second string contains first? false");
		}

	}

}
