package com.bharti.restfulws.user.webservice;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bharti.restfulws.service.UserService;
import com.bharti.restfulws.services.user.CreateUserRQType;
import com.bharti.restfulws.services.user.CreateUserRSType;
import com.bharti.restfulws.services.user.user.UserType;
import com.bharti.restfulws.webservice.adapter.usermaintenance.CreateUserRequestAdapter;

@RequestMapping(value = "/services/user")
@RestController
public class UserMaintenanceServiceImpl implements UserMaintenanceService {

	private CreateUserRequestAdapter createUserRequestAdapter;
	// private UserSecurityService will needs to validate the user credentials
	private UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	@Override
	public CreateUserRSType createUser(@RequestBody CreateUserRQType createUserRQType) {

		System.out.println("Invoked");
		// System.out.println(createUserRQDocument.getCreateUserRQ().getUser().getFirstName());
//		userService.createUser(user);
		
		return new CreateUserRSType();
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public CreateUserRQType test() {
		CreateUserRQType createUserRQType = new CreateUserRQType();

		UserType userType = new UserType();
		userType.setAge(30);
		userType.setFirstName("Amit");
		userType.setLastName("Bharti");
		userType.setId(10L);

		createUserRQType.setUser(userType);

		System.out.println(createUserRQType.toString());

		return createUserRQType;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}