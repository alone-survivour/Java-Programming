package com.basic2.numbers;

public abstract class PolygonType {
	public abstract double getArea();
	public abstract double gtPerimeter();
	public double truncateTo(double value, int decimalPlaces) {
		int truncatedNumberInt=(int)(value*Math.pow(10, decimalPlaces));
		double truncatedNumber=(double)(truncatedNumberInt/Math.pow(10, decimalPlaces));
		return truncatedNumber;
	}
}

class Triangle extends PolygonType{
	double a,b,c;
	Triangle(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	@Override
	public double getArea() {
		double s = (a+b+c)/2;
		double r = s*(s-a)*(s-b)*(s-c);
		double resultArea = Math.pow(r, 0.5);
		return truncateTo(resultArea,2);
	}

	@Override
	public double gtPerimeter() {
		double resultPeri = (a+b+c)/2;
		return truncateTo(resultPeri,2);
	}
}

class Circle extends PolygonType{
	
	double radius;
	Circle(double r){
		this.radius = r;
	}

	@Override
	public double getArea() {
		double cirArea = Math.PI * radius * radius;
		return truncateTo(cirArea, 2);
	}

	@Override
	public double gtPerimeter() {
		double cirPeri = 2 * Math.PI * radius;
		return truncateTo(cirPeri, 2);
	}
}

class Rectangle extends PolygonType{
	double length;
	double width;
	Rectangle(double l, double w){
		length=l;
		width=w;
	}
	
	@Override
	public double getArea() {
		double rectArea = length * width;
		return truncateTo(rectArea, 2);
	}

	@	Override
	public double gtPerimeter() {
		double rectPeri = 2*(length + width);
		return truncateTo(rectPeri, 2);
	}
}
