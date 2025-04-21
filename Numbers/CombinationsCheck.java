package com.basic2.numbers;

import java.util.Scanner;

public class CombinationsCheck {
	public int checkCombinations(int targetValue){
        int noOfCombis = 0;
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                for(int k=0; k<10; k++){
                    for(int l=0; l<10; l++){
                        if(i+j+k+l == targetValue){
                            noOfCombis++;
                        }
                    }
                }
            }
        }
        return noOfCombis;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value: ");
        int userTarget = sc.nextInt();
        CombinationsCheck c = new CombinationsCheck();
        System.out.println("No of possible combinations of a,b,c,d are: "+c.checkCombinations(userTarget));
        sc.close();

	}

}
