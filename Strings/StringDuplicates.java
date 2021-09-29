package com.basic.strings;

import java.util.Arrays;

public class StringDuplicates {
	public static boolean is_Unique_str(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xyyz";
		System.out.println("Original String : "+str);
		System.out.println("String has all unique characters: "+is_Unique_str(str));

	}

}
