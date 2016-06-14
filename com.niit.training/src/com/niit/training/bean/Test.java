package com.niit.training.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void displayAccountDetails(Account a)
	{
	System.out.println(a.getId());
	System.out.println(a.getName());
	}
	public static void display(Customer c)
	{
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPassword());
		
		List accounts=c.getMyaccount();
		Iterator it=accounts.iterator();
		
		while(it.hasNext())
		{
			Account a= (Account) it.next();
			displayAccountDetails(a);
		}
	}
	
	
	
	public static void main(String[] args){
	Customer c1=new Customer();
	c1.setId("1");
	c1.setName("sai");
	c1.setPassword("chand");
	
	
	Account ac=new Account();
	ac.setId(1000);
	ac.setName("sb");
	List account=new ArrayList();
    account.add(ac);
    
    ac=new Account();
    ac.setId(1001);
	ac.setName("bb");
    account.add(ac);
    c1.setMyaccount(account);
    Test.display(c1);
}
}
