package com.samples;

public class EmployeeDto {
    
	private String empId;
    private String empName;
    private String empDept;
     
    public EmployeeDto(){}
    
    public EmployeeDto(String empId, String empName, String empDept) {
    	this.empId = empId;
    	this.empName = empName;
    	this.empDept = empDept;
    }
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	} 
	@Override
	public String toString() {
		return "[ (Emp Id:" + getEmpId() + "), (Emp Name:" + getEmpName() + "), (Emp Dept :" + getEmpDept() + ")]"; 
	}
}
