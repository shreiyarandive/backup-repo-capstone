package com.my.bank.dao;

import java.sql.SQLException;

import com.my.bank.models.Banks;

public interface BankDAO extends BankBranchDAO {

	public Boolean createBank() throws SQLException;

	public Banks viewDetailsByIFSC(String ifscCode) throws SQLException;
}
