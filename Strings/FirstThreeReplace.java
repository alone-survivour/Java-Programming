package com.basic.strings;

public class FirstThreeReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "";    
		int len = str1.length();
		if(len >= 3)
			System.out.println( str1.substring(0, 3));
		else if(len == 1)
			System.out.println( (str1.charAt(0)+"##"));
		else
			System.out.println("###");
		}

}
