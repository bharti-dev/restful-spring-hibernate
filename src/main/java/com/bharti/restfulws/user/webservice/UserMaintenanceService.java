package com.bharti.restfulws.user.webservice;

import com.bharti.restfulws.services.user.CreateUserRQType;
import com.bharti.restfulws.services.user.CreateUserRSType;

public interface UserMaintenanceService {
	CreateUserRSType createUser(CreateUserRQType createUserRQType);
}