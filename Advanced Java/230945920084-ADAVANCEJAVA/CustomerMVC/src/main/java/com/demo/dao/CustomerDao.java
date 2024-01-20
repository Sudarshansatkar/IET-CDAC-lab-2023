package com.demo.dao;

import java.util.List;

import com.demo.model.Customer;

public interface CustomerDao {

	List<Customer> findAllcustomers();

	void save(Customer c);

	Customer findById(String cid);

	void modifyProduct(Customer Customer);
//
//	void removeById(String cid);

}
