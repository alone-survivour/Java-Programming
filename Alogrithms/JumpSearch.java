package com.exercises.searchingalgos;

import java.util.Arrays;
import java.util.Scanner;

public class JumpSearch {
	private int doSearchWithJumping(int[] inputArr, int valueToSearch) {
		int m = (int)Math.floor(Math.sqrt(inputArr.length));
		int currentLastIndex = m-1;
		while(currentLastIndex < inputArr.length && valueToSearch > inputArr[currentLastIndex]) {
			currentLastIndex +=m;
		}
		for(int i=currentLastIndex-m+1; i<=currentLastIndex && i<inputArr.length; i++) {
			if(valueToSearch == inputArr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int sizeOfUserInputArr = sc.nextInt();
		int[] userInputArr = new int[sizeOfUserInputArr];
		for(int i=0; i<sizeOfUserInputArr; i++) {
			System.out.println("Enter the element at: "+i);
			userInputArr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search ing above array: ");
		int userInputElem = sc.nextInt();
		JumpSearch js = new JumpSearch();
		int elemeFoundIndex = js.doSearchWithJumping(userInputArr, userInputElem);
		if(elemeFoundIndex == -1) {
			System.out.println(userInputElem+" is not present in given array "+Arrays.toString(userInputArr));
		} else {
			System.out.println(userInputElem+" is present at index "+elemeFoundIndex+" of the given array "+Arrays.toString(userInputArr));
		}
		sc.close();
	}

}
