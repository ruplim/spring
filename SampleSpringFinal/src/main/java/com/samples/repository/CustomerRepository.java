package com.samples.repository;

import java.util.List;

import com.samples.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}