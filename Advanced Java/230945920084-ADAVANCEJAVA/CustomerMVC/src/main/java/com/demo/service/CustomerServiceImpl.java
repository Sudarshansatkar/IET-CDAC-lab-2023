package com.demo.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CustomerDao;

import com.demo.model.Customer;
import com.demo.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	 private CustomerDao pdao;

	public List<Customer> getAllcustomers() {
		return pdao.findAllcustomers();
	}

	@Override
	public void addnewProduct(Customer c) {
		pdao.save(c);
		
	}

//	@Override
//	public Customer getById(String cid) {
//		return pdao.findById(cid);
//	}



	@Override
	public void updateById(Customer Customer) {
		pdao.modifyProduct(Customer);
		
	}

//	@Override
//	public void deleteById(int id) {
//		pdao.removeById(id);
//		
//	}

}
