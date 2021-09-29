package com.basic2.strings;

import java.util.Scanner;

public class NumberExtractor {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int count =0;
        String tmp = "0";
		System.out.println("Input some text and numeric values:"); 
        char ch[]=in.nextLine().toCharArray();
        for(int i=0; i<ch.length; i++)
          {
           while(i<ch.length&&(Character.isDigit(ch[i])))
            {
                tmp+=ch[i];
                i++;
             }
           count+=Integer.valueOf(tmp);
           tmp="0";
            }   
		System.out.println("\nSum of the numeric values:"); 	
        System.out.println(count);
        in.close();

	}

}
