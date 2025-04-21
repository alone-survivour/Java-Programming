package com.basic2.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PatternCheck {
	public static boolean word_Pattern_Match(String pattern, String str) {
		  char[] word_pattern = pattern.toCharArray();
		  String[] words = str.split(" ");

		  Map < Character, String > map = new HashMap < > ();
		  Set < String > set = new HashSet < > ();

		  for (int i = 0; i < word_pattern.length; i++) {
		   if (map.containsKey(word_pattern[i])) {
		    if (!map.get(word_pattern[i]).equals(words[i])) {
		     return false;
		    }
		    continue;
		   }

		   if (set.contains(words[i])) {
		    return false;
		   }
		   map.put(word_pattern[i], words[i]);
		   set.add(words[i]);
		  }
		  return true;
		 }

	public static void main(String[] args) {
		String str = "red black black red";
		  //String str = "red red red red"; 
		  String pattern = "xyxx";
		  //String pattern = "xxxx";
		  System.out.print("Is the string and pattern matched? " + word_Pattern_Match(pattern, str));
	}

}
