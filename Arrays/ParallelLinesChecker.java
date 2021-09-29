package com.basic2.arrays;

public class ParallelLinesChecker {
	
	public int calculateSlope(int[] a, int[] b) {
		int x1 = a[0];
		int y1 = a[1];
		int x2 = b[0];
		int y2 = b[1];
		try {
			int slope = (y2-y1)/(x2-x1);
			return slope;
		}
		catch(ArithmeticException e) {
			return 0;
		}
	}
	public boolean checkLinesParallel(int[] a, int[] b, int[] c, int[] d) {
		boolean isParallel = false;
		int slope1 = calculateSlope(a,b);
		int slope2 = calculateSlope(c,d);
		if(slope1 == slope2) {
			isParallel = true;
		}
		return isParallel;
	}

	public static void main(String[] args) {
		int[] a = {5,6};
		int[] b = {4,2};
		int[] c = {5,3};
		int[] d = {5,6};
		ParallelLinesChecker r = new ParallelLinesChecker();
		if(r.checkLinesParallel(a, b, c, d)) {
			System.out.println("Lines forming with above points are parallel");
		} else {
			System.out.println("Lines forming with above points are not parallel");
		}

	}

}
