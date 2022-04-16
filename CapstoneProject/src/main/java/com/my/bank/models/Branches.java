
package com.my.bank.models;

import java.util.Objects;

public class Branches implements Comparable<Branches> {
	private String branchCode;
	private Integer bankCode;
	private String manager;
	private Address address;
	private Address headOffice;

	public Branches() {
		super();
	}

	public Branches(String branchCode, Integer bankCode, String manager, Address address, Address headOffice) {
		super();
		this.branchCode = branchCode;
		this.bankCode = bankCode;
		this.manager = manager;
		this.address = address;
		this.headOffice = headOffice;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public Integer getBankCode() {
		return bankCode;
	}

	public void setBankCode(Integer bankCode) {
		this.bankCode = bankCode;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getHeadOffice() {
		return headOffice;
	}

	public void setHeadOffice(Address headOffice) {
		this.headOffice = headOffice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankCode, branchCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branches other = (Branches) obj;
		return Objects.equals(bankCode, other.bankCode) && Objects.equals(branchCode, other.branchCode);
	}

	@Override
	public int compareTo(Branches o) {
		if (this.equals(o))
			return 0;
		else
			return 1;
	}

	@Override
	public String toString() {
		return "Branches [branchCode=" + branchCode + ", bankCode=" + bankCode + ", manager=" + manager + ", address="
				+ address + ", headOffice=" + headOffice + "]";
	}

}
