package com.my.bank.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.my.bank.models.Banks;

public class BanksMapper implements RowMapper<Banks> {

	@Override
	public Banks mapRow(ResultSet rs, int rowNum) throws SQLException {
		Banks bank = new Banks();
		bank.setBankCode(rs.getString("bankCode"));
		bank.setBankName(rs.getString("bankName"));
		bank.setMainOfficeAddress(AddressMapper.processAddress(rs.getString("mainOfficeAddress")));
		return null;
	}

}
