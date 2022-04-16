package com.my.bank.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.my.bank.models.Customer;
import com.my.bank.models.Transaction;

public interface AdminDAO {
	public Admin getAdminById(Integer adminId) throws SQLException;

	public List<Transaction> showTransactions() throws SQLException;

	public List<Customer> showCustomers() throws SQLException;

	public Boolean approveReversal() throws SQLException;

	public Boolean rejectRevesal() throws SQLException;
}
