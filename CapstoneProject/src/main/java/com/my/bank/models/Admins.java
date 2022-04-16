package com.my.bank.models;

public class Admins {
	private Integer adminId;
	private String name;
	private String bankCode;

	public Admins() {
	}

	public Admins(Integer adminId, String name, String bankCode) {
		this.adminId = adminId;
		this.name = name;
		this.bankCode = bankCode;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	@Override
	public String toString() {
		return "Admins [adminId=" + adminId + ", name=" + name + ", bankCode=" + bankCode + "]";
	}

}