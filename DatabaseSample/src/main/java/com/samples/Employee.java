package com.samples;

import java.util.List;

public interface Employee {
    public void createEmployee(EmployeeDto empDto);
    public String getEmpName(String empId);
    public List<EmployeeDto> getAllEmployee();
}
