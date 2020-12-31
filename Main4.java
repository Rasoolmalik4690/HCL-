package org.hcl7;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Car Number : ");
		int CarNo = sc.nextInt();
		System.out.println("How many Years Old Car do you have ? ");
		int years = sc.nextInt();
		sc.nextLine();
		System.out.println("Car Brand : ");
		String CarBrand = sc.next();
		Car c1 = new Service(CarNo, CarBrand, years);
		c1.sum();
		c1.brand();
		c1.years();
		sc.close();
	}
}
