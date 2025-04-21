package com.exercises.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class FindDuplicatesInArr {
	public void getDuplicateElemInArr(int[] inputNums) {
		String duplicatesFound = "";
		for(int i=0; i<inputNums.length; i++) {
			for(int j=i+1; j<inputNums.length; j++) {
				if(inputNums[i]==inputNums[j]) {
					duplicatesFound = duplicatesFound+inputNums[i]+" ";
				}
			}
		}
		System.out.println("The duplicates in given array: "+Arrays.toString(inputNums)+" are "+duplicatesFound);
	}
	
	public void getDuplicateElemsInArray(int[] inputNums) {
		Map<Integer, Integer> my_hashmap = new HashMap<Integer, Integer>();
		String duplicateElemsInArr = "";
		my_hashmap.put(inputNums[0], 1);
		for(int i=1; i<inputNums.length; i++) {
			if(my_hashmap.containsKey(inputNums[i])) {
				int localExistingFreq = my_hashmap.get(inputNums[i]);
				my_hashmap.put(inputNums[i], localExistingFreq+1);	
			} else {
				my_hashmap.put(inputNums[i], 1);
			}
		}
		for(Entry<Integer, Integer> pairEntry : my_hashmap.entrySet()) {
			if(pairEntry.getValue() > 1) {
				duplicateElemsInArr = duplicateElemsInArr + pairEntry.getKey()+" ";
			}
		}
		System.out.println("The duplicates in above array is: "+duplicateElemsInArr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to have for integer array: ");
		int limitOfArray = sc.nextInt();
		System.out.println("Enter the elements one by one: ");
		int[] userInputArr = new int[limitOfArray];
		for(int i=0; i<userInputArr.length; i++) {
			userInputArr[i] = sc.nextInt();
		}
		FindDuplicatesInArr f = new FindDuplicatesInArr();
		//f.getDuplicateElemInArr(userInputArr);
		f.getDuplicateElemsInArray(userInputArr);
		sc.close();

	}

}
