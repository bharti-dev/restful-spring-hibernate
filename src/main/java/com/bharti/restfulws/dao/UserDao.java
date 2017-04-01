/**
 * 
 */
package com.bharti.restfulws.dao;

import com.bharti.restfulws.domain.User;

/**
 * @author AMIT
 *
 */
public interface UserDao {
	void createUser(User user);
	
	User updateUser(User user);
	
	User retrieveUser(int userId);
	
	void deleteUser(int userId);
}
