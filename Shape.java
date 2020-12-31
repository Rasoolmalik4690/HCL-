package org.hcl5;

public abstract class Shape {

	protected double area;

	public void computeArea() {
		this.area = 0;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
