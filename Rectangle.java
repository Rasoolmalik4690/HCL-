package org.hcl7;

public class Rectangle implements Polygon {
	private double length;
	private double Bredth;

	public Rectangle(double length, double bredth) {
		super();
		this.length = length;
		Bredth = bredth;
	}

	public double CalcPeri() {
		return 2 * (this.length + this.Bredth);
	}

	public double CalcArea() {
		return (this.length * this.Bredth);
	}
}
