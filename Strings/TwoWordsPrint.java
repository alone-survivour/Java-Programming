package com.basic2.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TwoWordsPrint {
	public String getMostFrequentWord(String inputStr) {
		String[] wordsInString = inputStr.split(" ");
		String mostFreqWord = "";
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put(wordsInString[0], 1);
		for(int i=1; i<wordsInString.length; i++) {
			if(hashMap.containsKey(wordsInString[i])) {
				int localExistingFreq = hashMap.get(wordsInString[i]);
				hashMap.put(wordsInString[i], localExistingFreq+1);	
			} else {
				hashMap.put(wordsInString[i], 1);
			}
		}
		int maxWord = Collections.max(hashMap.values());
		List<String> keys = new ArrayList<>();
		for (Entry<String, Integer> entry : hashMap.entrySet()) {
		    if (entry.getValue()==maxWord) {
		        keys.add(entry.getKey());
		    }
		}
		mostFreqWord = mostFreqWord + keys.get(0);
		return mostFreqWord;
	}
	
	public String getMaxLength(String inputStr) {
		String[] wordsInString = inputStr.split(" ");
		String highestLengthWord = "";
		int MaxWordLength = wordsInString[0].length();
		for(int i=0; i<wordsInString.length; i++) {
			if(wordsInString[i].length() > MaxWordLength) {
				MaxWordLength = wordsInString[i].length();
				highestLengthWord = wordsInString[i];
			}
		}
		return highestLengthWord;
	}

	public static void main(String[] args) {
		String userInput = "Thank you for your comment and your participation.";
		TwoWordsPrint tp = new TwoWordsPrint();
		System.out.println("Given String:\n"+userInput);
		System.out.println("Most frequent word and Highest length word occured in the above string is: "+tp.getMostFrequentWord(userInput)+" "+tp.getMaxLength(userInput));
	}

}
