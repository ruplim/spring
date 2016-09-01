package com.samples;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<EmployeeDto>{

	public EmployeeDto mapRow(ResultSet rs, int rowNum) throws SQLException {

		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setEmpId(rs.getString("EMPID"));
		employeeDto.setEmpName(rs.getString("EMPNAME"));
		employeeDto.setEmpDept(rs.getString("EMPDEPT"));
		
		return employeeDto;
	}

}
