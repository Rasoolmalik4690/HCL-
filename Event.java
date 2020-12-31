package org.hcl6;

public class Event {

	protected String name;
	protected String detail;
	protected String ownerName;

	public Event(String name, String detail, String ownerName) {
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public void displayEventDetails() {
		System.out.println("Event Class : ");
		System.out.println("Event Name : " + this.name);
		System.out.println("Event Details : " + this.detail);
		System.out.println("Event ownerName : " + this.ownerName);
	}
}
