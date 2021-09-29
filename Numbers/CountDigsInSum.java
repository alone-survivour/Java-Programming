package com.basic2.numbers;

public class CountDigsInSum {
	public int returnCountDigInSum(String inputStr) {
		int countOfSpaces = 0;
		int countDigitsInResult = 0;
		for(int i=0; i<inputStr.length(); i++) {
			if(inputStr.charAt(i)==' ') {
				countOfSpaces++;
			}
		}
		int numsGivenCount = 0;
		if(countOfSpaces == 1) {
			String[] stringNums = inputStr.split(" ");
			for(int j=0; j<stringNums.length; j++) {
				numsGivenCount++;
			}
		} else {
			return 0;
		}
		if(numsGivenCount==2) {
			String[] numsStrForm = inputStr.split(" ");
			int[] numsIntForm = new int[numsStrForm.length];
			int indexOfnumsIntForm = 0;
			for(int l=0; l<numsStrForm.length; l++) {
				numsIntForm[indexOfnumsIntForm]=Integer.parseInt(numsStrForm[l]);
				indexOfnumsIntForm++;
			}
			String resultantSumNums="";
			int sumNums=0;
			for(int m=0; m<numsIntForm.length; m++) {
				if(numsIntForm[m]>0) {
					sumNums = sumNums+numsIntForm[m];
				} else {
					return 0;
				}
			}
			resultantSumNums = resultantSumNums+sumNums;
			char[] digitsInResult = resultantSumNums.toCharArray();
			for(int n=0; n<digitsInResult.length; n++) {
				countDigitsInResult++;
			}
		} else {
			return 0;
		}
		return countDigitsInResult;
	}

	public static void main(String[] args) {
		String inputStr = "12 24";
		CountDigsInSum obj = new CountDigsInSum();
		System.out.println("Number of digits after summing the integers is: "+obj.returnCountDigInSum(inputStr));
	}

}
