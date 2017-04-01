package com.bharti.restfulws.domain;

import java.io.Serializable;

public class Email implements Serializable {
	private static final long serialVersionUID = 1L;
	private String email;
	private boolean isPrimary;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isPrimary() {
		return isPrimary;
	}
	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
}