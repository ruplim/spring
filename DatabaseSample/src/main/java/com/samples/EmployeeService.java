package com.samples;

import java.util.List;
import java.util.Map;

public class EmployeeService implements Employee {

	public EmployeeDao employeeDao;
	
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}


	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}


	public void createEmployee(EmployeeDto employeeDto) {
		
		employeeDao.insertEmployee(employeeDto);
		
	}


	public String getEmpName(String empId) {
		
		return employeeDao.getEmployee(empId).getEmpName();

	}


	public List<EmployeeDto> getAllEmployee() {
		
		return employeeDao.getAllEmployee();
	}


	public List<Map<String, Object>> listAllEmployee() {
		return employeeDao.listAllEmployee();
	}
	

}
