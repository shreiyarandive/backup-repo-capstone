package com.my.bank.dao;

import java.sql.SQLException;
import java.util.List;

import com.my.bank.models.Branches;
import com.my.bank.models.Customer;
import com.my.bank.models.Transaction;

public interface BranchDAO extends BankBranchDAO {
	public Boolean createBranch() throws SQLException;

	public Branches viewDetailsByIFSC(String ifscCode) throws SQLException;
	
	public List<Transaction> showTransactions() throws SQLException;
	
	public List<Customer> showCustomers() throws SQLException;
}
