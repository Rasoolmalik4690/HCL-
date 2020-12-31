package org.hcl3;

import java.util.Scanner;

public class Main6 {

	public static void showVenueDetails(Venue obj) {
		System.out.println("\n" + "Venue Details :");
		System.out.println("Venue Name : " + obj.getName());
		System.out.println("City Name : " + obj.getCity());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Venue a = new Venue();
		System.out.println("Enter the venue name");
		String name = sc.nextLine();
		a.setName(name);
		System.out.println("Enter the city name");
		String city = sc.nextLine();
		a.setCity(city);
		showVenueDetails(a);
		byte temp;
		do {
			System.out.println("Verify and Update Venue Details \n" + "Menu");
			System.out.println("1. Update Venue Name \n" + "2. Update City Name \n"
					+ "3. All informations Correct/Exit \n" + "Type 1 or 2 or 3 ");
			temp = sc.nextByte();
			sc.nextLine();
			switch (temp) {
			case 1:
				System.out.println("Enter the venue name");
				String s = sc.nextLine();
				a.setName(s);
				showVenueDetails(a);
				break;
			case 2:
				System.out.println("Enter the City name");
				a.setCity(sc.nextLine());
				showVenueDetails(a);
				break;
			default:
				break;
			}
		} while (temp != 3);

		showVenueDetails(a);
	}

}
