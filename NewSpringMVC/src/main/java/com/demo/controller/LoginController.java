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
@RequestMapping("/login")
public class LoginController {
	@Autowired 
	RegisterService rservice;
	
	@GetMapping("/")
	public String loginForm() {
		return ("login");
	}
	
	@PostMapping("/validate")
	public ModelAndView validate(@RequestParam String username, @RequestParam String password) {
		User u = rservice.validate(username, password);
		if(u!=null) {
			return new ModelAndView("success","msg","You have successfully Login"); 
		}
		return new ModelAndView("redirect:/login/"); 
	}

}
