package com.samples;

import java.util.List;

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
		
		empService.createEmployee(new EmployeeDto("1", "Rahul", "TENNIS"));
		empService.createEmployee(new EmployeeDto("2", "Sachin", "SPORTS"));
		LOGGER.info(" #### Employee name :" + empService.getEmpName("1"));
		
		List<EmployeeDto> empList = empService.getAllEmployee();
		
		for(EmployeeDto edto : empList) {
			LOGGER.info(edto);
		}
		
        ctx.close();

	}

}
