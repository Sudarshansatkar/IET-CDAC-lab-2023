package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
   @Autowired
   private JdbcTemplate jdbcTemplate;

public List<Customer> findAllcustomers() {
	return jdbcTemplate.query("select * from customers1", (rs,num)->{
		Customer p=new Customer();
		p.setCid(rs.getString(1));
		p.setBpack(rs.getString(2));
		p.setOppack(rs.getString(3));

		return p;
	});
}

@Override
public void save(Customer c) {
	String str="insert into customers1 values(?,?,?)";
	jdbcTemplate.update(str,new Object[] {c.getCid(),
			c.getBpack(),c.getOppack()});
	
}

@Override
public Customer findById(String cid) {
	try {
	    return jdbcTemplate.queryForObject("select * from customers1 where cid=?",new Object[] {cid},BeanPropertyRowMapper.newInstance(Customer.class));
	}catch(EmptyResultDataAccessException e) {
		return null;
	}
	
}


@Override
public void modifyProduct(Customer Customer) {
	jdbcTemplate.update("update customers1 set cid=?,bpack=?,oppack=? where cid=?",
			new Object[] {Customer.getCid(),Customer.getBpack(),Customer.getOppack(),Customer.getCid()});
	
}

//@Override
//public void removeById(int id) {
//	jdbcTemplate.update("delete from product where pid=?",new Object[] {id});
//	
//}    
}
