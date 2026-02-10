package com.cg.BiteBeeFoodApplication.LoginCredentials;

public class AdminLogin1 {
	private String email;
	private String password;
	
	public AdminLogin1(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public AdminLogin1() {
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserLogin [email=" + email + ", password=" + password + "]";
	}
	

}
