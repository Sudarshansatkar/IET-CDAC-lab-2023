package com.demo.service;

import java.util.List;

import com.demo.model.Customer;

public interface CustomerService {

	List<Customer> getAllProducts();

	void addnewProduct(Customer p);

	Customer getById(int pid);

	void updateById(Customer product);

	void deleteById(int id);

}
