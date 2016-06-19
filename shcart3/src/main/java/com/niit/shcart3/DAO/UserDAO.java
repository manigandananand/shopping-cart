package com.niit.shcart3.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	public boolean isValidUser(String name, String password)
	{
		if (name.equals("niit") && password.equals("niit@123"))
		{
			return true;
		}
		else
		{
			return false;

		}
	}
}
