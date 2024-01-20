package com.demo.controller;

import java.util.List;  

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.MyUser;
import com.demo.model.Customer;
import com.demo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService pservice;
	
	@GetMapping("/getcustomer")
	public ModelAndView getProducts(HttpSession session) {
		MyUser u=(MyUser) session.getAttribute("user");
		if(u!=null) {
		   System.out.println(u);
		   List<Customer> plist=pservice.getAllcustomers();
		   return new ModelAndView("displaycustomer","plist",plist);
		}
		return new ModelAndView("redirect:/login/");
	}
	
	@GetMapping("/addcustomer")
	public String displayaddform(HttpSession session) {
		MyUser u=(MyUser) session.getAttribute("user");
		if(u!=null) 
		   return "addcustomer";
		return "redirect:/login/"; 
	}
	
	@PostMapping("/insertCustomer")
	public ModelAndView insertProduct(@RequestParam String cid, @RequestParam String bpack,@RequestParam String oppack) {
		Customer p=new Customer(cid,bpack,oppack);
		pservice.addnewProduct(p);
		return new ModelAndView("redirect:/customer/getcustomer");
		
	}
	

	
	@PostMapping("/updateCustomer")
	public ModelAndView updateProdut(@RequestParam String cid, @RequestParam String bpack,@RequestParam String oppack) {
		pservice.updateById(new Customer(cid,bpack,oppack));
		return new ModelAndView("redirect:/customer/getcustomer");
	}
	
//	@GetMapping("delete/{id}")
//	public ModelAndView deleteProduct(@PathVariable int id) {
//		pservice.deleteById(id);
//		return new ModelAndView("redirect:/product/getproducts");
//	}
//	
	
//	@GetMapping("/edit/{id}")
//	public ModelAndView editProduct(@PathVariable("id") int pid) {
//		Product p=pservice.getById(pid);
//		return new ModelAndView("editProduct","p",p);
//		
//	}
	
	

}
