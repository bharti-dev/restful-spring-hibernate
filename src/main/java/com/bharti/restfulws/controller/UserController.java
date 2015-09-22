/**
 * 
 */
package com.bharti.restfulws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author AMIT
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
		
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public void getUserById() {
		
	}
}
