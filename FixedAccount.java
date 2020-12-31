package org.hcl4;

public class FixedAccount extends SavingAccount {

	private int lockingPeriod;

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
}

