package com.basic2.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StrCount {
	public String getCountRepeatedChar(String inputStr) {
		char[] StrToChars = inputStr.toCharArray();
		String repeatedCharsString = "";
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put(StrToChars[0], 1);
		for(int i=1; i<StrToChars.length; i++) {
			if(hm.containsKey(StrToChars[i])) {
				int localExistingFreq = hm.get(StrToChars[i]);
				hm.put(StrToChars[i], localExistingFreq+1);	
			} else {
				hm.put(StrToChars[i], 1);
			}
		}
		for(Entry<Character, Integer> pairEntry : hm.entrySet()) {
			repeatedCharsString = repeatedCharsString + pairEntry.getKey()+pairEntry.getValue();
		}
		return repeatedCharsString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the repeated character String: ");
		String inputStr = sc.next();
		StrCount s = new StrCount();
		System.out.println("Resultant String: "+ s.getCountRepeatedChar(inputStr));
		sc.close();
	}

}
