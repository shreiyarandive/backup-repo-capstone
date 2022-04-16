
package com.my.bank.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.my.bank.models.Branches;

public class BranchMapper implements RowMapper<Branches> {

	@Override
	public Branches mapRow(ResultSet rs, int rowNum) throws SQLException {
		Branches branch = new Branches();
		branch.setBranchCode(rs.getString("branchCode"));
		branch.setAddress(AddressMapper.processAddress(rs.getString("address")));
		branch.setManager(rs.getString("manager"));
		branch.setHeadOffice(AddressMapper.processAddress(rs.getString("headOffice")));
		branch.setBankCode(rs.getInt("bankCode"));
		return branch;
	}

}
