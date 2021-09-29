package com.exercises.sorting;
import java.util.Arrays;
public class CocktailSort{
	private void doCocktailSorting(int[] a){
		boolean swapped;
		do{
			swapped = false;
			for(int i=0; i<=a.length-2; i++){
				if(a[i]>a[i+1]){
					int tmp = a[i];
					a[i] = a[i+1];
					a[i+1] = tmp;
					swapped=true;
				}
			}
			if(!swapped){
				break;
			}
			swapped=false;
			for(int i=a.length-2; i>=0; i--){
				if(a[i]>a[i+1]){
					int tmp = a[i];
					a[i] = a[i+1];
					a[i+1] = tmp;
					swapped=true;
				}
			}
		}while(swapped);
		System.out.println("Sorted Array: "+Arrays.toString(a));
	}
	public static void main(String...args){
		int[] arr = {31,81,84,23,63,57,16,10,25,90,47};
		System.out.println("Unsorted Array: "+Arrays.toString(arr));
		CocktailSort ob = new CocktailSort();
		ob.doCocktailSorting(arr);
	}
}