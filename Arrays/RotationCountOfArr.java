package com.exercises.arrays;

import java.util.Scanner;

public class RotationCountOfArr {
	public int countNoOfRotations(int[] inputArray) {
		int min_val = inputArray[0], min_index = -1;
		for (int i = 0; i < inputArray.length; i++)
        {
            if (min_val > inputArray[i])
            {
                min_val = inputArray[i];
                min_index = i;
            }
        } 
		return min_index;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int sizeOfUserInputArray = sc.nextInt();
		int[] UserInputArray = new int[sizeOfUserInputArray];
		for(int i=0; i<UserInputArray.length; i++) {
			System.out.println("Enter the element at index "+i+" : ");
			UserInputArray[i]=sc.nextInt();
		}
		RotationCountOfArr ra = new RotationCountOfArr();
		System.out.println("Number of rotations done for given array: "+ra.countNoOfRotations(UserInputArray));
		sc.close();

	}

}
