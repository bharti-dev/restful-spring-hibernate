package com.bharti.restfulws.domain;

import java.io.Serializable;
import java.util.List;

public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String addressFirstLine;
	private String addressSecondLine;
	private String addressThirdLine;
	private int pinCode;
	private String city;
	private String state;	
	
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
	public String getAddressFirstLine() {
		return addressFirstLine;
	}
	public void setAddressFirstLine(String addressFirstLine) {
		this.addressFirstLine = addressFirstLine;
	}
	public String getAddressSecondLine() {
		return addressSecondLine;
	}
	public void setAddressSecondLine(String addressSecondLine) {
		this.addressSecondLine = addressSecondLine;
	}
	public String getAddressThirdLine() {
		return addressThirdLine;
	}
	public void setAddressThirdLine(String addressThirdLine) {
		this.addressThirdLine = addressThirdLine;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}