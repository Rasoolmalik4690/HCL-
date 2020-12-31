package org.hcl6;

public class Exhibition extends Event {

	public int noOfStalls;

	public Exhibition(String name, String detail, String ownerName, int noOfStalls) {
		super(name, detail, ownerName);
		this.noOfStalls = noOfStalls;
	}

	public void displayEventDetails() {
		System.out.println("Exhibition Event Class :");
		System.out.println("Event Name : " + this.name);
		System.out.println("Event Details : " + this.detail);
		System.out.println("Event ownerName : " + this.ownerName);
		System.out.println("No:of Stalls : " + this.noOfStalls);
	}
}
