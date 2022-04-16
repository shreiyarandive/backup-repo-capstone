package com.my.bank.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.my.bank.models.Transaction;

public interface TransactionDAO {
	public Boolean deposit(Double amount) throws SQLException;

	public Boolean withdraw(double amount) throws SQLException;

//add start date and end date
	public List<Transaction> showTransactions() throws SQLException;
}
