package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	 private CustomerDao pdao;

	public List<Customer> getAllProducts() {
		return pdao.findAllproducts();
	}

	@Override
	public void addnewProduct(Customer c) {
		pdao.save(c);
		
	}

	@Override
	public Customer getById(int pid) {
		return pdao.findById(pid);
	}

	@Override
	public void updateById(Product product) {
		pdao.modifyProduct(product);
		
	}

	@Override
	public void deleteById(int id) {
		pdao.removeById(id);
		
	}

}
