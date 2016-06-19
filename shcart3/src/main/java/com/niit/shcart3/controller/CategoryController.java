package com.niit.shcart3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shcart3.DAO.UserDAO;

@Controller
public class CategoryController {

	@Autowired
	private UserDAO userDAO;

	@RequestMapping("/addCategory")
	public ModelAndView addCategory(@RequestParam(value = "categoryName") String categoryName,
			@RequestParam(value = "categoryDescription") String categoryDescription)

	{
		System.out.println("addCategory");
		String message = "Successfully created";
		ModelAndView mv = new ModelAndView("/success");
		mv.addObject("message", message);

		return mv;

	}
}