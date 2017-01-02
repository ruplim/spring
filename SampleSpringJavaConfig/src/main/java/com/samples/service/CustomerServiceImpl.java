package com.samples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samples.model.Customer;
import com.samples.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	public CustomerServiceImpl() {
		
	}
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		
	}
	
	private CustomerRepository customerRepository;
	

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
