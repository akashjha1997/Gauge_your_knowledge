package com.cognizant.dao;

public interface LoginDao {
	public boolean validateLogin(String email,String password,String emptype);
	public String getUserId(String email,String password,String emptype);
	public String getUsername(String email,String password,String emptype);
	
}
