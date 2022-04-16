package com.my.bank.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.my.bank.models.Admins;

public class AdminsMapper implements RowMapper<Admins> {

	@Override
	public Admins mapRow(ResultSet rs, int rowNum) throws SQLException {
		Admins admin = new Admins();
		admin.setAdminId(rs.getInt("adminId"));
		admin.setName(rs.getString("name"));
		admin.setBankCode(rs.getString("bankCode"));
		return admin;
	}

}
