package org.hcl7;

public class Square implements Polygon {
	public double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double CalcPeri() {
		return 4 * (this.side);
	}

	public double CalcArea() {
		return (this.side * this.side);
	}

}
