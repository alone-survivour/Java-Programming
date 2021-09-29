package com.exercises.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class LengthBeforeAndAfterDuplicates {
	
	public String[] getRemovedDuplicatesStuff(int[] inputNums) {
		Map<Integer, Integer>hm = new HashMap<Integer, Integer>();
		for(int i=0; i<inputNums.length; i++) {
			if(hm.containsKey(inputNums[i])) {
				hm.remove(inputNums[i]);
			}
			hm.put(inputNums[i], i);
		}
		String nonRemovableElems = "";
		for(Entry<Integer, Integer> pairEntry : hm.entrySet()) {
			nonRemovableElems = nonRemovableElems + pairEntry.getKey() + " ";
		}
		String[] nonRemovableElemsStrForm = nonRemovableElems.split(" ");
		int[] nonRemovableElemsIntForm = new int[nonRemovableElemsStrForm.length];
		for(int i=0; i<nonRemovableElemsStrForm.length; i++) {
			nonRemovableElemsIntForm[i] = Integer.parseInt(nonRemovableElemsStrForm[i]);
		}
		return nonRemovableElemsStrForm;
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
		LengthBeforeAndAfterDuplicates ladd = new LengthBeforeAndAfterDuplicates();
		System.out.println("Length of array before removing duplicates: "+userInputArr.length);
		String[] resultantArrayAfterDuplicates = ladd.getRemovedDuplicatesStuff(userInputArr);
		System.out.println("Length of array after removing duplicates: "+resultantArrayAfterDuplicates.length);
		sc.close();
	}

}
