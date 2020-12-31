package org.hcl4;

public class AccountBO {

	public FixedAccount getAccountDetails(String detail) {
		String[] str = detail.split(",");
		FixedAccount fixedAcc = new FixedAccount();
		fixedAcc.setAccountNumber(str[0]);
		fixedAcc.setBalance(Double.parseDouble(str[1]));
		fixedAcc.setAccountHolderName(str[2]);
		fixedAcc.setMinimumbalance(Double.parseDouble(str[3]));
		fixedAcc.setLockingPeriod(Integer.parseInt(str[4]));
		return fixedAcc;
	}
}	


