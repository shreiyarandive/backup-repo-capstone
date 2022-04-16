
package com.my.bank.models;

public abstract class BankAccount {
	private Integer accountNo;
	private Integer customerId;
	private String branchCode;
	private Double balance;
	private AccountType type;

	public BankAccount(Integer accountNo, Integer customerId, String branchCode, Double balance, AccountType type) {
		this.accountNo = accountNo;
		this.customerId = customerId;
		this.branchCode = branchCode;
		this.balance = balance;
		this.type = type;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public Double returnBalance() {
		return balance;
	}

	public void updateBalance(Double balance) {
		this.balance = balance;
	}

	abstract double calculateCharges();

	abstract double calculateInterest();

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", customerId=" + customerId + ", branchCode=" + branchCode
				+ ", type=" + type + "]";
	}

}
