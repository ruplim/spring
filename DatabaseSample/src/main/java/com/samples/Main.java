package com.samples;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class);
	
	private Main(){}
	
	public static void main(String[] args) {
		
		final AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean.xml");
		ctx.registerShutdownHook();
		
		Employee empService = (Employee)ctx.getBean("employeeService");
		
		empService.createEmployee(new EmployeeDto("3", "CTS", "TENNIS"));
		empService.createEmployee(new EmployeeDto("4", "NT", "SPORTS"));
		
		LOGGER.info(" #### Employee name :" + empService.getEmpName("3"));
		
		List<EmployeeDto> empList = empService.getAllEmployee();
		for(EmployeeDto edto : empList) {
			LOGGER.info(edto);
		}
		
		List<Map<String,Object>> empMapList = empService.listAllEmployee();
		for( Map<String,Object> empRow :empMapList) {
			LOGGER.info( empRow.get("EMPID") + ":" + empRow.get("EMPNAME") + ":" + empRow.get("EMPDEPT"));
		}
		
        ctx.close();

	}

}
