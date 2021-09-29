package com.exercises.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class RemoveDuplicatesInArr {
	public int[] removeDuplicatesOfArr(int[] inputNums) {
		Map<Integer, Integer>my_hm_duplicates = new HashMap<Integer, Integer>();
		for(int x : inputNums) {
			if(!my_hm_duplicates.containsKey(x)) {
				my_hm_duplicates.put(x, 1);
			} else {
				my_hm_duplicates.put(x, my_hm_duplicates.get(x)+1);
			}
		}
		String remainingElems = "";
		for(Entry<Integer, Integer> pairEntry : my_hm_duplicates.entrySet()) {
			if(pairEntry.getValue() == 1) {
				remainingElems = remainingElems + pairEntry.getKey() + " ";
			}
		}
		String[] removedDuplicatesInArr = remainingElems.split(" ");
		int[] removedDuplicatesInArrInt = new int[removedDuplicatesInArr.length];
		for(int k=0; k<removedDuplicatesInArrInt.length; k++) {
			removedDuplicatesInArrInt[k] = Integer.parseInt(removedDuplicatesInArr[k]);
		}
		return removedDuplicatesInArrInt;
	}
	
	public String getRemovedDuplicatesStuff(int[] inputNums) {
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
		String resultArray = Arrays.toString(nonRemovableElemsIntForm);
		return resultArray;
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
		RemoveDuplicatesInArr rd = new RemoveDuplicatesInArr();
		System.out.println("Before removing duplicates: "+Arrays.toString(userInputArr));
		//System.out.println("After removing the duplicates: "+Arrays.toString(rd.removeDuplicatesOfArr(userInputArr)));
		System.out.println("After removing the duplicates: "+rd.getRemovedDuplicatesStuff(userInputArr));
		//rd.getRemovedDuplicatesStuff(userInputArr);
		sc.close();
	}
}
