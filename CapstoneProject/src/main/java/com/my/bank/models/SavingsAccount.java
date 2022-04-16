
package com.my.bank.models;

public class SavingsAccount extends BankAccount {
	static final double RATEOFINTEREST = 3.5;

	public SavingsAccount(Integer accountNo, Integer customerId, String branchCode, Double balance, AccountType type) {
		super(accountNo, customerId, branchCode, balance, type);
	}

	@Override
	double calculateCharges() {
		double charges = 100; // Service Charge
		if (super.returnBalance() < 5000) {
			charges += ((5000 - super.returnBalance()) % 100) * 5 + 75;
			// Rs 5 for every 100 shortfall + minimum charge of Rs. 75
		}
		return charges;
	}

	@Override
	double calculateInterest() {
		return (super.returnBalance() * 3) / 100;
	}

}
