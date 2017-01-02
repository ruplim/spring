package com.samples.repository;

import java.util.ArrayList;
import java.util.List;

import com.samples.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	private String databaseUser;
    public void setDatabaseUser(String databaseUser) {
    	this.databaseUser = databaseUser;
    }
	@Override
	public List<Customer> findAll() {
		
		System.out.println("database User :: " + databaseUser);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Bryan");
		customer.setLastname("Hansen");
		
		customers.add(customer);
		
		return customers;
	}
}
