package org.hcl3;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String bowlername = null, nonstriker = null, batsman = null;
		long over, ball;
		Long runs;
		System.out.println("Enter the over");
		over = sc.nextLong();
		System.out.println("Enter the ball ");
		ball = sc.nextLong();
		System.out.println("Enter the runs");
		runs = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name");
		batsman = sc.nextLine();

		System.out.println("Enter the bowler name");
		bowlername = sc.nextLine();
		System.out.println("Enter the nonstriker name");
		nonstriker = sc.nextLine();
		Delivery2 d = new Delivery2(over, ball, runs, batsman, bowlername, nonstriker);
		System.out.println("over" + d.getOver());
		System.out.println("ball" + d.getBall());
		System.out.println("runs" + d.getRuns());
		System.out.println("batsman" + d.getBatsman());
		System.out.println("bowler" + d.getBowler());
		System.out.println("nonstriker" + d.getNonstriker());

	}

}
