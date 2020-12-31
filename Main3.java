package org.hcl5;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Shape :");
		System.out.println("1. Circle\n" + "2. Rectangle\n" + "3. Traingle");
		byte b = sc.nextByte();
		if (b == 1) {
			System.out.println("Enter the radius :");
			double radius = sc.nextDouble();
			Shape circle = new Circle(radius);
			circle.computeArea();
		} else if (b == 2) {
			System.out.println("Enter length and breadth :");
			double length = sc.nextDouble();
			double breadth = sc.nextDouble();
			Shape rectangle = new Rectangle(length, breadth);
			rectangle.computeArea();
		} else if (b == 3) {
			System.out.println("Enter base and height");
			double base = sc.nextDouble();
			double height = sc.nextDouble();
			Shape triangle = new Triangle(base, height);
			triangle.computeArea();
		} else {
			System.out.println("Invaild Choice");
		}
	}
}

