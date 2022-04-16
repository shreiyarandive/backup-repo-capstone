package com.my.bank.dao;

import java.sql.SQLException;
import java.util.List;

import com.my.bank.models.ReversalRequests;

public interface ReversalRequestsDAO {

	public Boolean createRequest() throws SQLException;

	public List<ReversalRequests> showAll() throws SQLException;

	public Boolean deleteRequest(Integer reqId) throws SQLException;

	public Boolean approveRequest(Integer reqId) throws SQLException;

}
