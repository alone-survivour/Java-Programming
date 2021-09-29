package com.basic2.numbers;

import java.util.Scanner;

public class ModeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int cnt[] = new int[100];
		int i;
        System.out.println("How many integers would you like to input(Max.100?)");
		int x = input.nextInt();
		input.close();
        System.out.println("Input the integers:");
        for (i = 0; i <x; i++){ 
         int n = input.nextInt();
            cnt[--n]++;	
		}
        int max = 0;
        for (int n : cnt){
            if (max < n){
                max = n;
            }
        }
        System.out.println("Mode value(s)in ascending order:");
        for (i = 0; i < cnt.length; i++){
            if (cnt[i] == max){
                System.out.println(i + 1);
            }
        }
        
	}

}
