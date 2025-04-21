package com.exercises.sorting;
import java.util.Arrays;
import java.util.Scanner;
public class BucketSort{
	private static int[] doBucketSorting(int[] a, int n){
		int i, j, k, SIZE = a.length;
		int buckets[] = new int[SIZE];
		for(i = 0; i < SIZE; ++i)
			buckets[i] = 0;
		for(i = 0; i < n; ++i)
			++buckets[a[i]];
		for(i = 0, j = 0; j < SIZE; ++j)
			for(k = buckets[j]; k > 0; --k)
				a[i++] = j;
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of input array: ");
		int sizeOfArray = sc.nextInt();
		int[] userInputArr = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++) {
			System.out.println("Enter the element at "+i+" : ");
			userInputArr[i] = sc.nextInt();
		}
		System.out.println("Before sorting: "+Arrays.toString(userInputArr));
		System.out.println("After sorting: "+Arrays.toString(doBucketSorting(userInputArr, userInputArr.length)));
		sc.close();
	}
}