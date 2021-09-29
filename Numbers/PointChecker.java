package com.basic2.numbers;

import java.util.Arrays;

public class PointChecker {
	public boolean checkPointGiven(int[] a, int[] b, int[] c, int[] p) {
		boolean isgivenPoint = false;
		int area = calculateArea(a,b,c);
		int area1 = calculateArea(p,b,c);
		int area2 = calculateArea(a,p,c);
		int area3 = calculateArea(a,b,p);
		if(area == area1+area2+area3) {
			isgivenPoint=true;
		}
		return isgivenPoint;
	}
	public static int calculateArea(int[] point1, int[] point2, int[] point3) {
		int x1 = point1[0];
		int y1 = point1[1];
		int x2 = point2[0];
		int y2 = point2[1];
		int x3 = point3[0];
		int y3 = point3[1];
		int resultantNumerator = (x1*y2+x2*y3+x3*y1) - (x2*y1+x3*y2+x1*y3);
		int area = resultantNumerator/2;
		return area;
	}
	public static void main(String[] args) {
		int[] a = {0,0};
		int[] b = {20,0};
		int[] c = {10,30};
		int[] p = {10,15};
		PointChecker pc = new PointChecker();
		System.out.println("Points of a triangle are "+Arrays.toString(a)+", "+Arrays.toString(b)+", and "+Arrays.toString(c)+"\n");
		System.out.println("Given point is: "+ Arrays.toString(p)+"\n");
		if(pc.checkPointGiven(a, b, c, p)) {
			System.out.println("Is above point "+Arrays.toString(p)+" lies within the triangle? - yes");
		} else {
			System.out.println("Is above point "+Arrays.toString(p)+" lies within the triangle? - no");
		}
	}
}
