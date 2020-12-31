package org.hcl6;

public class StageEvent extends Event {

	public int noOfShows;
	public int noOfSeatsPerShow;

	public StageEvent(String name, String detail, String ownerName, int noOfShows, int noOfSeatsPerShow) {
		super(name, detail, ownerName);
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public void displayEventDetails() {
		System.out.println("Stage Event Class :");
		System.out.println("Event Name : " + this.name);
		System.out.println("Event Details : " + this.detail);
		System.out.println("Event ownerName : " + this.ownerName);
		System.out.println("No:of Shows : " + this.noOfShows);
		System.out.println("No:of Seats per Show : " + this.noOfSeatsPerShow);
	}
}
