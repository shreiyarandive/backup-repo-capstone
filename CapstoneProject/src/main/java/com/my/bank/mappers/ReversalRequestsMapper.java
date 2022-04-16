package com.my.bank.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.my.bank.models.ReversalRequests;

public class ReversalRequestsMapper implements RowMapper<ReversalRequests> {

	@Override
	public ReversalRequests mapRow(ResultSet rs, int rowNum) throws SQLException {
		ReversalRequests reversalRequest = new ReversalRequests();
		reversalRequest.setReqId(rs.getInt("reqId"));
		reversalRequest.setTransactionNo(rs.getInt("transactionNo"));
		reversalRequest.setReqDate(rs.getTimestamp("reqDate"));
		return reversalRequest;
	}

}