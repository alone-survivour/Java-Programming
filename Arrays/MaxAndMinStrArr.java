package com.exercises.arrays;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class MaxAndMinStrArr {

	public void getMaxAndMinArrStr(String[] inputStrArr) {
		Map<String, Integer> my_hashmap_str = new HashMap<String, Integer>();
		String duplicatesFound = "";
		my_hashmap_str.put(inputStrArr[0], 1);
		for(int i=1; i<inputStrArr.length; i++) {
			if(my_hashmap_str.containsKey(inputStrArr[i])) {
				int localExistingFreq = my_hashmap_str.get(inputStrArr[i]);
				my_hashmap_str.put(inputStrArr[i], localExistingFreq+1);	
			} else {
				my_hashmap_str.put(inputStrArr[i], 1);
			}
		}
		for(Entry<String, Integer> pairEntry : my_hashmap_str.entrySet()) {
			if(pairEntry.getValue() > 1) {
				duplicatesFound = duplicatesFound + pairEntry.getKey()+" ";
			}
		}
		
		System.out.println("The duplicates in above array is: "+duplicatesFound);
	}

	public static void main(String[] args) {
		String[] userInputStringArr = {"Java","Javascript","Python","Rust","Go","ReactJS","Java","HTML","PHP","R","Rust"};
		MaxAndMinStrArr m = new MaxAndMinStrArr();
		m.getMaxAndMinArrStr(userInputStringArr);
	}

}
