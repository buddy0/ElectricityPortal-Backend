package com.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="https://localhost:4200")
@RestController
public class UserController {
    @Autowired
	UserService us;
    
    @PostMapping("/userLogin")
	public String getUser(@RequestBody UserCredential u) {
    	if(us.validateUser(u.getUsername(), u.getPassword())) {
    		return "Successful Login";
    	}
    	else {
    		return "Invalid Username and password combination"; 
    	}
	}
}
