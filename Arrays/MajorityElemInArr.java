package com.exercises.arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Arrays;
import java.util.HashMap;

public class MajorityElemInArr {
	
	public int getMajorityElemInArray(int[] inputArray) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<inputArray.length; i++) {
			if(!hm.containsKey(inputArray[i])) {
				hm.put(inputArray[i], 1);
			} else {
				hm.put(inputArray[i], hm.get(inputArray[i])+1);
			}
		}
		int majorityElemInArr = 0;
		int conditionToMet = inputArray.length/2;
		for(Entry<Integer, Integer> pairEntry : hm.entrySet()) {
			if((pairEntry.getValue() > 1) && (pairEntry.getValue() == conditionToMet)) {
				majorityElemInArr = pairEntry.getKey();
			}
		}
		return majorityElemInArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to have for integer array: ");
		int limitOfArray = sc.nextInt();
		int[] userInputArr = new int[limitOfArray];
		for(int i=0; i<userInputArr.length; i++) {
			System.out.println("Enter the element at index "+i+": ");
			userInputArr[i] = sc.nextInt();
		}
		MajorityElemInArr mer = new MajorityElemInArr();
		System.out.println("Element that occurred majorly in given array "+Arrays.toString(userInputArr)+" is "+mer.getMajorityElemInArray(userInputArr));
		sc.close();
	}

}
