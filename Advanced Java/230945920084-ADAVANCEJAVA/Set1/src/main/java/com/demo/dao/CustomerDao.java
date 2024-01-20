package com.demo.dao;

import java.util.List;

import com.demo.model.Customer;

public interface CustomerDao {

	List<Customer> findAllproducts();

	void save(Customer p);

	Customer findById(int pid);

	void modifyProduct(Customer product);

	void removeById(int id);

}
