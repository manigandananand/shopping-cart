package com.niit.shoopingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoopingcart.bean.Category;

public class TestCategory {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoopingcart.bean");
		context.refresh();
		Category c = (Category) context.getBean("category");
		c.setId("101");
		c.setName("praneet");
		c.setDescription("good");
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getDescription());
		
		
		if (c == null) {
			System.out.println("unamble to get category object");
		} else {
			System.out.println("category object is creatsed");
		}
	}
}
