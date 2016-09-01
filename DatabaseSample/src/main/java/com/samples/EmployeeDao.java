package com.samples;



import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private static final Logger LOGGER = Logger.getLogger(EmployeeDao.class);
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insertEmployee(EmployeeDto employeeDto) {
		
		String sql = "INSERT INTO X_EMPLOYEE(EMPID, EMPNAME, EMPDEPT) values (?,?,?)";
		int count = getJdbcTemplate().update(sql, employeeDto.getEmpId(), employeeDto.getEmpName(), employeeDto.getEmpDept());
		
		LOGGER.info(" #### Created record for " + employeeDto);
		LOGGER.info(" #### Record created count " + count);
		
		return count;
	}
	
	public EmployeeDto getEmployee(String employeeId) {
		String sql = "select * from X_EMPLOYEE where EMPID=?";		
		return getJdbcTemplate().queryForObject(sql, new Object[]{employeeId}, new EmployeeMapper());
	}

	public List<EmployeeDto> getAllEmployee() {
		String sql = "select * from X_EMPLOYEE";
		return getJdbcTemplate().query(sql, new EmployeeMapper());
	}

	
}
