package com.niit.shcart3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shcart3.DAO.UserDAO;

@Controller
public class UserController {

	@Autowired
	UserDAO userDAO;

	@RequestMapping("/isValidUser")
	public ModelAndView showMesssage(@RequestParam(value = "name") String name,
			@RequestParam(value = "password") String password) {
		System.out.println("in controller");
		String message;
		if (userDAO.isValidUser(name, password)) {
			message = "valid credtials";
		} else {
			message = "invalid credtials";
		}
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		System.out.println("in controller");
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}
}
