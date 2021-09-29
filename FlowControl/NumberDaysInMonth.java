package com.exercises.conditionalStatements;

import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberDaysInMonth {
	public boolean checkLeapYear(int inputYear) {
		boolean isLeapYear = false;
		if(inputYear%4==0) {
			if(inputYear%100==0) {
				if(inputYear%400==0) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}
			}
			else {
				isLeapYear = true;
			}
		} else {
			isLeapYear = false;
		}
		return isLeapYear;
	}
	
	public void getNumberOfDays(int monthOfYear, int year) {
		boolean isGivenYear = checkLeapYear(year);
		Map<Integer, String> month_names = new HashMap<Integer, String>();
		month_names.put(1, "Januvary");
		month_names.put(2, "Februvary");
		month_names.put(3, "March");
		month_names.put(4, "April");
		month_names.put(5, "May");
		month_names.put(6, "June");
		month_names.put(7, "July");
		month_names.put(8, "August");
		month_names.put(9, "September");
		month_names.put(10, "October");
		month_names.put(11, "November");
		month_names.put(12, "December");
		Map<String, Integer> days_in_month = new HashMap<String, Integer>();
		days_in_month.put("Januvary", 31);
		days_in_month.put("Februvary", 28);
		days_in_month.put("March", 31);
		days_in_month.put("April", 30);
		days_in_month.put("May", 31);
		days_in_month.put("June", 30);
		days_in_month.put("July", 31);
		days_in_month.put("August", 31);
		days_in_month.put("September", 30);
		days_in_month.put("October", 31);
		days_in_month.put("November", 30);
		days_in_month.put("December", 31);
		if(isGivenYear) {
			String monthOfTheYear = month_names.get(monthOfYear);
			if(monthOfTheYear=="Februvary") {
				int noOfDaysInMonth = days_in_month.get(monthOfTheYear)+1;
				System.out.println(monthOfTheYear+" "+year+" has "+noOfDaysInMonth+" days");
			} else {
				int noOfDaysInMonth = days_in_month.get(monthOfTheYear);
				System.out.println(monthOfTheYear+" "+year+" has "+noOfDaysInMonth+" days");
			}
		} else {
			String monthOfTheYear = month_names.get(monthOfYear);
			int noOfDaysInMonth = days_in_month.get(monthOfTheYear);
			System.out.println(monthOfTheYear+" "+year+" has "+noOfDaysInMonth+" days");
		}
	}
	
	public int getNumberOfDayss(int inputYear, int monthOfYear) {
		YearMonth ym = YearMonth.of(inputYear, monthOfYear);
		int daysInMonth = ym.lengthOfMonth();
		return daysInMonth;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int user_input_year = sc.nextInt();
		System.out.println("Enter the month: ");
		int user_input_month = sc.nextInt();
		NumberDaysInMonth n = new NumberDaysInMonth();
		//n.getNumberOfDays(user_input_month, user_input_year);
		System.out.println(n.getNumberOfDayss(user_input_year, user_input_month)+" days");
		sc.close();
	}

}
