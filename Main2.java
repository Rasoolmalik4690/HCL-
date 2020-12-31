package org.hcl7;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What you want to visit");
		System.out.println("Rajmachi" + "\n" + "Shivgadh" + "\n" + "Murud");
		String str = sc.next();
		Fort f;
		if (str.equalsIgnoreCase("RAJMACHI")) {
			f = new Rajmachi();
			f.distance();
		} else if (str.equalsIgnoreCase("SHIVGADH")) {
			f = new Shivgadh();
			f.distance();
		} else if (str.equalsIgnoreCase("MURUD")) {
			f = new Murud();
			f.distance();
		}
	}

}
