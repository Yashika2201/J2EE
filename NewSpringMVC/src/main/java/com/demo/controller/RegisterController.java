package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.User;
import com.demo.service.RegisterService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	RegisterService rs;
	@GetMapping("/")
	public String showForm() {
		return ("register");
	}
	
	@PostMapping("/addemployee")
	public ModelAndView addEmp(@RequestParam String username, @RequestParam String email, @RequestParam String password) {
		User u = new User(username, email, password);
		rs.addUser(u);
		return new ModelAndView("success", "msg", "You have Successfully Registered");
	}
	
}
