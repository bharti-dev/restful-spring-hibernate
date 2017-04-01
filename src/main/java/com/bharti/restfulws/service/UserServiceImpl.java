/**
 * 
 */
package com.bharti.restfulws.service;

import org.springframework.stereotype.Service;

import com.bharti.restfulws.domain.User;

/**
 * @author AMIT
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	/* (non-Javadoc)
	 * @see com.bharti.restfulws.service.UserService#createUser(com.bharti.restfulws.domain.User)
	 */
	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.bharti.restfulws.service.UserService#updateUser(com.bharti.restfulws.domain.User)
	 */
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bharti.restfulws.service.UserService#retrieveUser(int)
	 */
	@Override
	public User retrieveUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bharti.restfulws.service.UserService#deleteUser(int)
	 */
	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub

	}

}
