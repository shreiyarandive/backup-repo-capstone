
package com.my.bank.models;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(Integer accountNo, Integer customerId, String branchCode, Double balance, AccountType type) {
		super(accountNo, customerId, branchCode, balance, type);
	}

	@Override
	double calculateCharges() {
		double charges = 100;
		if (super.returnBalance() >= 500 && super.returnBalance() < 1000)
			charges += 1000;
		else if (super.returnBalance() < 500)
			charges += 1800;
		return charges;
	}

	@Override
	double calculateInterest() {
		return 0;
	}

}
