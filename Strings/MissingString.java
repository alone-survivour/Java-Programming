package com.basic2.strings;

import java.util.Arrays;

public class MissingString {
	public String[] getMissingStr(String s1, String s2) {
		String[] t = s1.split(" ");
		String[] w = s2.split(" ");
		String[] missing_Str = new String[t.length - w.length];
		int c=0;
		for(int i=0; i<t.length; i++) {
			int flag = 0;
			for(int j=0; j<w.length; j++) {
				if(t[i].equals(w[j])) {
					flag = 1;
				}
			}
			if (flag == 0) {
				missing_Str[c++] = t[i];
			}
		}
		return missing_Str;
	}

	public static void main(String[] args) {
		  String str1 = "Java Programming Exercises, Practice, Solution";
		  String str2 = "Java Programming Exercises, Practice,";
		  MissingString m = new MissingString();
		  System.out.println("Missing string: " + Arrays.toString(m.getMissingStr(str1, str2)));
	}

}
