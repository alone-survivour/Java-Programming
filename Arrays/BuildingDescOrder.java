package com.basic2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BuildingDescOrder {
	public void genTopThreeBuildings(String inputStr) {
		String seperatorChar = "";
		for(int i=0; i<inputStr.length(); i++) {
			if(inputStr.charAt(i)==' ' || inputStr.charAt(i)==',' || inputStr.charAt(i)=='-') {
				seperatorChar = seperatorChar + inputStr.charAt(i);
			}
		}
		if(inputStr.contains(Character.toString(seperatorChar.charAt(0)))) {
			String[] stringNums = inputStr.split(Character.toString(seperatorChar.charAt(0)));
			int[] convStrtoIntNums = new int[stringNums.length];
			for(int k=0; k<stringNums.length; k++) {
				convStrtoIntNums[k] = Integer.parseInt(stringNums[k]);
			}
			Arrays.sort(convStrtoIntNums);
			int[] descOrderIntNums = new int[convStrtoIntNums.length];
			int indexOfdescOrderIntNums = 0;
			for(int x=convStrtoIntNums.length-1; x>=0; x--) {
				descOrderIntNums[indexOfdescOrderIntNums]=convStrtoIntNums[x];
				indexOfdescOrderIntNums++;
			}
			System.out.println("Top three buiding heights are: "+ descOrderIntNums[0]+", "+descOrderIntNums[1]+" and "+descOrderIntNums[2]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the eight building heights using seperator , or - or whitespace: ");
		String receivedStr = sc.next();
		BuildingDescOrder bdo = new BuildingDescOrder();
		bdo.genTopThreeBuildings(receivedStr);
		sc.close();
	}

}
