
package com.my.bank.models;

import java.util.Objects;


public class Banks implements Comparable<Banks> {
	private String bankCode;
	private String bankName;
	private Address mainOfficeAddress;

	public Banks() {
	}

	public Banks(String bankCode, String bankName, Address mainOfficeAddress) {
		this.bankCode = bankCode;
		this.bankName = bankName;
		this.mainOfficeAddress = mainOfficeAddress;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Address getMainOfficeAddress() {
		return mainOfficeAddress;
	}

	public void setMainOfficeAddress(Address mainOfficeAddress) {
		this.mainOfficeAddress = mainOfficeAddress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banks other = (Banks) obj;
		return Objects.equals(bankCode, other.bankCode);
	}

	@Override
	public int compareTo(Banks o) {
		if (this.equals(o))
			return 0;
		else
			return 1;
	}

	@Override
	public String toString() {
		return "Bank [bankCode=" + bankCode + ", bankName=" + bankName + ", mainOfficeAddress=" + mainOfficeAddress
				+ "]";
	}

}
