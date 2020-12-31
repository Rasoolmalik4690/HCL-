package org.hcl8;

public class EventTypeDoesNotExistsException extends Exception {
	String exceptionmsg = "EventTypeDoesNotExistsException: No event type available with the given id";

	public EventTypeDoesNotExistsException() {
	}

	public EventTypeDoesNotExistsException(String message) {
		this.exceptionmsg = "EventTypeDoesNotExistsException : " + message;
	}

	public String toString() {
		return this.exceptionmsg;
	}
}
