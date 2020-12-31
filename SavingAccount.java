package org.hcl4;

public class SavingAccount extends Account {
	protected double minimumbalance;

	public double getMinimumbalance() {
		return minimumbalance;
	}

	public void setMinimumbalance(Double minimumbalance) {
		this.minimumbalance = minimumbalance;
	}
}
