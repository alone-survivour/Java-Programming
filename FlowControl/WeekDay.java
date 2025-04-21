package com.exercises.conditionalStatements;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WeekDay {
	public void getWeekDay(int inputNum) {
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Monday");
		hash_map.put(2, "Tuesday");
		hash_map.put(3, "Wednesday");
		hash_map.put(4, "Thrusday");
		hash_map.put(5, "Friday");
		hash_map.put(6, "Saturday");
		hash_map.put(7, "Sunday");
		if(hash_map.containsKey(inputNum) && inputNum==1) {
			System.out.println(inputNum+"st day of week is: "+hash_map.get(inputNum));
		} else if(hash_map.containsKey(inputNum) && inputNum==2) {
			System.out.println(inputNum+"nd day of week is: "+hash_map.get(inputNum));
		} else if(hash_map.containsKey(inputNum) && inputNum==3) {
			System.out.println(inputNum+"rd day of week is: "+hash_map.get(inputNum));
		} else {
			System.out.println(inputNum+"th day of week is: "+hash_map.get(inputNum));
		}
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the daynumber to check: ");
		int userInput = sc.nextInt();
		WeekDay w = new WeekDay();
		w.getWeekDay(userInput);
		sc.close();
	}

}
