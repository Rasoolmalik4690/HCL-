package org.hcl7;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ChooseStall Type");
		System.out.println("1) Gold Stall\n 2) Premium Stall\n 3) Executive Stall");
		byte b = sc.nextByte();
		sc.nextLine();
		if (b == 1) {
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");

			String[] str = sc.nextLine().split(",");
			Stall s = new GoldStall(str[0], Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]));
			s.display();
		} else if (b == 2) {
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)1");

			String[] str = sc.nextLine().split(",");
			Stall s = new PremiumStall(str[0], Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]));
			s.display();
		} else if (b == 3) {
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");

			String[] str = sc.nextLine().split(",");
			Stall s = new ExecutiveStall(str[0], Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]));
			s.display();
		}
	}

}
