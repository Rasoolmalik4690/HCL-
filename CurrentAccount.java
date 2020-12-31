package org.hcl1;

public class CurrentAccount extends Account {
	private String tinNumber;

	public CurrentAccount() {
	}

	public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
		super(accName, accNo, bankName);
		this.tinNumber = tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public String getTinNumber() {
		return this.tinNumber;
	}

	public void display() {
		super.display();
		System.out.println("TinNumber : " + this.tinNumber);
	}
}
