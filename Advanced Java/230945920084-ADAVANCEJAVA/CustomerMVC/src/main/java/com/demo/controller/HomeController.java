package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Customer;
import com.demo.model.MyUser;


@Controller
@RequestMapping("/Home")
public class HomeController 
{


	@GetMapping("/Home")
	public ModelAndView getProducts(HttpSession session)
	{
		MyUser u=(MyUser) session.getAttribute("user");
		if(u!=null) {
			return new ModelAndView("redirect:/Home/");
		}
		return new ModelAndView("redirect:/login/");
	}
	
}
