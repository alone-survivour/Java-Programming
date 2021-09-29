package com.exercises.string;

public class LongestPalindromeWithinStr {
	
	static void printSubStr(String str1, int l, int h) {
		  System.out.println(str1.substring(l, h + 1));
		 }
	public static int getLongestPalindromeString(String inputString) {
		int n = inputString.length();
		boolean[][] booleanTable = new boolean[n][n];
		int mLength = 1;
		  for (int i = 0; i < n; ++i)
			booleanTable[i][i] = true;
		  int strt = 0;
		  for (int i = 0; i < n - 1; ++i) {
		   if (inputString.charAt(i) == inputString.charAt(i + 1)) {
			   booleanTable[i][i + 1] = true;
		    strt = i;
		    mLength = 2;
		   }
		  }
		  for (int k = 3; k <= n; ++k) {
		   for (int i = 0; i < n - k + 1; ++i) {
		    int j = i + k - 1;
		    if (booleanTable[i + 1][j - 1] && inputString.charAt(i) == inputString.charAt(j)) {
		    	booleanTable[i][j] = true;

		     if (k > mLength) {
		      strt = i;
		      mLength = k;
		     }
		 }
		   }
		  }
		  System.out.print("The longest palindrome substring in the given string is; ");
		  printSubStr(inputString, strt, strt + mLength - 1);
		  return mLength;
}

	public static void main(String[] args) {
		String str1 = "thequickbrownfoxxofnworbquickthe";
		  System.out.println("The given string is: " + str1);
		  System.out.println("The length of the palindromic substring is: " + getLongestPalindromeString(str1));

	}

}
