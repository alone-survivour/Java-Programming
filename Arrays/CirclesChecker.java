package com.basic2.arrays;

public class CirclesChecker {
	public int[] calculateTheArray(String inputStr) {
		String[] strNumsForm = inputStr.split(" ");
		int[] intNumsForm = new int[strNumsForm.length];
		for(int i=0; i<strNumsForm.length; i++) {
			intNumsForm[i]=Integer.parseInt(strNumsForm[i]);
		}
		return intNumsForm;
	}
	public double calculateDistance(int a, int b, int c, int d) {
		int dbCompute = d-b;
		int caCompute = c-a;
		int computeSqr = (dbCompute*dbCompute) + (caCompute*caCompute);
		double result = Math.sqrt(computeSqr);
		return result;
	}
	public void checkCircleCond(String s1, String s2) {
		int[] a = calculateTheArray(s1);
		int[] b = calculateTheArray(s2);
		int x1 = a[0], y1=a[1], r1 = a[2], x2=b[0], y2=b[1], r2=b[2];
		double distance = calculateDistance(x1,y1,x2,y2);
		if(distance+r2 == r1) {
			System.out.println("The smaller circle lies completely inside the bigger circle with touching each other at a point of the circumference");
		} else if(distance+ r2 < r1) {
			System.out.println("The smaller circle lies completely inside the bigger circle without touching each other at a point of the circumference");
		} else {
			System.out.println("The smaller does not lies inside the bigger circle completely.");
		}
	}

	public static void main(String[] args) {
		String userInput1 = "10 8 30";
		String userInput2 = "1 2 10";
		CirclesChecker c = new CirclesChecker();
		c.checkCircleCond(userInput1, userInput2);

	}

}
