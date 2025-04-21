package com.exercises.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrListToArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>(2);
		list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));

	}

}
