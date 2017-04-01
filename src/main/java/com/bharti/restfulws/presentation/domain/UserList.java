/**
 * 
 */
package com.bharti.restfulws.presentation.domain;

import java.io.Serializable;
import java.util.List;

import com.bharti.restfulws.domain.User;

/**
 * @author AMIT
 *
 */
public class UserList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int count;
	private List<User> users;
	
	public UserList(int count, List<User> users) {
		this.count = count;
		this.users = users;
	}
	
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}
	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}
}