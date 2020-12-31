package org.hcl7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Bredth & Length Of the Square :");
		double length = sc.nextDouble();
		double Bredth = sc.nextDouble();
		Polygon p = new Rectangle(length, Bredth);
		System.out.println("Enter the Side Value : ");
		double side = sc.nextDouble();
		Polygon t = new Square(side);

		System.out.println("Perimeter of the Rectangle: " + p.CalcPeri());
		System.out.println("Area of the Rectangle : " + p.CalcArea());
		System.out.println("Perimeter of the Square : " + t.CalcPeri());
		System.out.println("Area of the Square : " + t.CalcArea());
	}
}
