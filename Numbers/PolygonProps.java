package com.basic2.numbers;

public class PolygonProps {
	public static void main(String[] args) {
		Triangle tr = new Triangle(6.58,7.52,8.88);
		System.out.println("Area of triangle with sides "+tr.a+", "+tr.b+", and "+tr.c+" is: "+tr.getArea()+" m2.");
		System.out.println("Perimeter of triangle with sides "+tr.a+", "+tr.b+", and "+tr.c+" is: "+tr.gtPerimeter()+" m.");
		Circle c = new Circle(5.47);
		System.out.println("Area of circle with radius "+ c.radius+" m is: "+c.getArea()+" m2");
		System.out.println("Perimeter of circle with radius "+c.radius+" m is: "+c.gtPerimeter()+" m");
		Rectangle r = new Rectangle(6.55,4.11);
		System.out.println("Area of rectangle with length "+r.length+" and width "+r.width+" is: "+r.getArea()+" m2");
		System.out.println("Perimeter of rectangle with length "+r.length+" and width "+r.width+" is: "+r.gtPerimeter()+" m");
	}
}
