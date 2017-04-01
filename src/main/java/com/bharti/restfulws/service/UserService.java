/**
 * 
 */
package com.bharti.restfulws.service;

import com.bharti.restfulws.domain.User;

/**
 * @author AMIT
 *
 */
public interface UserService {
	void createUser(User user);
	
	User updateUser(User user);
	
	User retrieveUser(int userId);
	
	void deleteUser(int userId);
}
