package com.samples;

import java.util.List;
import java.util.Map;

public interface Employee {
    public void createEmployee(EmployeeDto empDto);
    public String getEmpName(String empId);
    public List<EmployeeDto> getAllEmployee();
    public List<Map<String,Object>> listAllEmployee();
}
