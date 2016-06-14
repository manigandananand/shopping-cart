package com.niit.training.bean;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
	
	
	private List myaccount=new ArrayList();
	
	
	public List getMyaccount() {
		return myaccount;
	}
	public void setMyaccount(List myaccount) {
		this.myaccount = myaccount;
	}



	private String shippingadd;
	
	public String getShippingadd() {
		return shippingadd;
	}
	public void setShippingadd(String shippingadd) {
		this.shippingadd = shippingadd;
	}
	
	
	
	private String permanentadd;
	
	public String getPermanentadd() {
		return permanentadd;
	}
	public void setPermanentadd(String permanentadd) {
		this.permanentadd = permanentadd;
	}
	
	
 
}
