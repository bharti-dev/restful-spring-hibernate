/**
 * 
 */
package com.bharti.restfulws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bharti.restfulws.domain.User;
import com.bharti.restfulws.presentation.domain.UserList;

/**
 * @author AMIT
 *
 */
@RequestMapping("/")
@RestController("userController")
public class UserController {
		
	@RequestMapping(value="/{id}", method=RequestMethod.GET, headers="Accept=text/html,application/json")
	public User getUserById(@PathVariable long id) {		
		return new User();
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET, produces={"application/json","application/xml"})	
	public UserList getAllUsers() {		
		return prepareList();
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET, produces={"application/json","application/xml"})	
	public int test() {		
		return 1/0;
	}
	
	/*@RequestMapping(value="/", method=RequestMethod.GET)
	public String test(Model model) {		
		return "index";
	}*/
	
	/*@RequestMapping(value="/", method=RequestMethod.GET)	
	public @ResponseBody User getUser() {		
		User u = new User();
		u.setFirstName("Amit");
		u.setLastName("Bharti");
		return u;
	}*/
	
	private UserList prepareList() {
		List<User> l = new ArrayList<User>(); 
		
		User u1 = new User();
		u1.setFirstName("Amit");
		u1.setLastName("Bharti");
		
		User u2 = new User();
		u2.setFirstName("Neelima");
		u2.setLastName("Bharti");
		
		l.add(u1);
		l.add(u2);
				
		return new UserList(l.size(), l);
	}
}