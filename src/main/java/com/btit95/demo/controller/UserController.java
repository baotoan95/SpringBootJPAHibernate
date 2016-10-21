package com.btit95.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.btit95.demo.dao.UserDAO;
import com.btit95.demo.entities.User;

@Controller
public class UserController {
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String helloPage() {
		return "index";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String create(ModelMap response) {
		User user = new User("Bao Toan", "baotoan.95@gmail.com");
		userDAO.create(user);
		return "index";
	}
}
