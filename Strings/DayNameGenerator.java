package com.basic2.strings;

import java.util.Scanner;

public class DayNameGenerator {
	public static String getDayName(int month, int date) {
		int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    String[] name = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	    int cur = 3;
		System.out.println("Name of the day:");
        for(int i=0; i<month-1; i++) cur += days[i];
        cur += date-1;
        return name[cur%7];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input month and date(o o to exit)");
		in.close();
        for(;;){
            int m=in.nextInt(), d=in.nextInt();
            if(m==0&&d==0) break;
            System.out.println(getDayName(m,d));
        }

	}

}
