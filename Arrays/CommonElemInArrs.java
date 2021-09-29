package com.exercises.arrays;

public class CommonElemInArrs {
	public void checkCommonElemsInArrs(String[] inputStrArr1, String[] inputStrArr2) {
		String commonElemInArr = "";
		for(int i=0; i<inputStrArr1.length; i++) {
			for(int j=0; j<inputStrArr2.length; j++) {
				if(inputStrArr1[i] == inputStrArr2[j]) {
					commonElemInArr = commonElemInArr + inputStrArr1[i] + " ";
				}
			}
		}
		System.out.println("Common elements are: "+commonElemInArr.trim());
	}

	public static void main(String[] args) {
		String[] userInputStrArr1 = {"Oracle","PHP","Java","Javascript","ReactJS","Laravel","Python"};
		String[] userInputStrArr2 = {"Singapore","Japan","Argentina","Denmark","Indonesia","Java","Oracle"};
		CommonElemInArrs c = new CommonElemInArrs();
		c.checkCommonElemsInArrs(userInputStrArr1, userInputStrArr2);
	}

}
