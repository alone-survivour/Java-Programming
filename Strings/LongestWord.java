package com.basic.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestWord {
	static ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> list = new ArrayList<String>();
        int longest_length = 0;
        for (String str : dictionary) {
            int length = str.length();
            if (length > longest_length) {
                longest_length = length;
                list.clear();
            }
            if (length == longest_length) {
                list.add(str);
            }
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] dict = {"cat", "dog", "red", "is", "am"};
		System.out.println("Original dictionary : "+Arrays.toString(dict));
		System.out.println("Longest word(s) of the above dictionary: "+longestWords(dict));

	}

}
