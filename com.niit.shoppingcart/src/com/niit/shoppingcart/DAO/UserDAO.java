package com.niit.shoppingcart.DAO;

public class UserDAO {
   public boolean isValidCredentials(String userid,String password)
    {
 	  if(userid.equals("niit") && password.equals("niit@123"))
 	  {
 		  return true;
 	  }
 	  else
 	  {
 		  return false;
 		  
 	  }
} 

}
