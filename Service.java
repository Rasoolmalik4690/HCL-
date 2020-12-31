package org.hcl7;

public class Service implements Car {

	private double ServiceCharges = 5000;
	private int CarNo;
	private String CarBrand;
	private int Years;

	public Service(int carno, String carBrand, int years) {
		super();

		CarNo = carno;
		CarBrand = carBrand;
		Years = years;
	}

	public void sum() {
		int num1, num2 = 0;
		int n = this.CarNo;
		while (n != 0) {
			num1 = n % 10;
			num2 = num1++;
			n = n / 10;
		}
		if (num2 % 2 == 0)
			System.out.println("You can come on Tuesday, Thursday or Saturday");
		else
			System.out.println("You can come on Monday, Wednesday and Friday");
	}

	public void years() {
		if (this.Years >= 5)
			System.out.println("You are Eligible for Free Washing.");
		else
			System.out.println("You are Not Eligible for Free Washing");
	}

	public void brand() {
		if (this.CarBrand.equalsIgnoreCase("Maruti"))
			this.ServiceCharges = (this.ServiceCharges * 5f / 100);
		System.out.println("Your Servicing Charges are -" + this.ServiceCharges);
	}
}
