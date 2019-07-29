package com.Admin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminCredential {
	@Id
	private String username;
	private String password;
	
	public AdminCredential() {
		// TODO Auto-generated constructor stub
	}

	public AdminCredential(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
