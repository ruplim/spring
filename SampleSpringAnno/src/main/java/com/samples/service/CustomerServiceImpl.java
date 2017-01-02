package com.samples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samples.model.Customer;
import com.samples.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	
	public CustomerServiceImpl() {}
	
	@Autowired
	//Constructor Injection
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	//@Autowired
	//member variable injection 
	private CustomerRepository customerRepository;
	
	
	
    //@Autowired
    //setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
