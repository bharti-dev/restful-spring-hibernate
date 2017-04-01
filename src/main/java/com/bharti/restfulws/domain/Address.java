package com.bharti.restfulws.domain;

import java.io.Serializable;
import java.util.List;

public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Email> emailAddresses;
	
	/**
	 * @return the emailAddresses
	 */
	public List<Email> getEmailAddresses() {
		return emailAddresses;
	}
	/**
	 * @param emailAddresses the emailAddresses to set
	 */
	public void setEmailAddresses(List<Email> emailAddresses) {
		this.emailAddresses = emailAddresses;
	}
}