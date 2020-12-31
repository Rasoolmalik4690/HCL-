package org.hcl5;

public class Triangle extends Shape {

	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public void computeArea() {
		this.area = 0.5 * this.base * this.height;
		System.out.printf("Area of Triangle : %.2f", super.area);
	}
}
