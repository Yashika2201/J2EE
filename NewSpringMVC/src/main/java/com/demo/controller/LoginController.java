package com.demo.controller;

import javax.servlet.http.HttpSession;

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
	public ModelAndView validate(@RequestParam String username, @RequestParam String password, HttpSession session) {
		User u = rservice.validate(username, password);
		if(u!=null) {
			session.setAttribute("user", u);
			return new ModelAndView("redirect:/employee"); 
		}
		return new ModelAndView("redirect:/login/"); 
	}

}
