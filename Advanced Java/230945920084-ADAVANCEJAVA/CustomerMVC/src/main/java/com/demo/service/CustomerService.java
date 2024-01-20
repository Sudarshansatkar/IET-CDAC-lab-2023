package com.demo.service;

import java.util.List;

import com.demo.model.Customer;

public interface CustomerService
{

	List<Customer> getAllcustomers();

	void addnewProduct(Customer p);

	Customer getById(String cid);

	void updateById(Customer Customer);
//
//	void deleteById(int id);

}
