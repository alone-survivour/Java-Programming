package com.basic2.strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
	public boolean checkIsomorphic(String str1, String str2) {
		if(str1.length() != str2.length() || str1==null || str2==null) {
			return false;
		}
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
            char char_str1 = str1.charAt(i), char_str2 = str2.charAt(i);
            if (map.containsKey(char_str1)) 
			{
                if (map.get(char_str1) != char_str2)
					return false;
            }
			else 
			{
                if (map.containsValue(char_str2)) 
					return false;
             map.put(char_str1, char_str2);
            }
        }
		return true;
	}

	public static void main(String[] args) {
		String s1 = "abxz";
		String s2 = "aayu";
		Isomorphic io = new Isomorphic();
		System.out.println("Is "+s1+" and "+s2+" are isomorphic to each other? "+ io.checkIsomorphic(s1, s2));

	}

}
