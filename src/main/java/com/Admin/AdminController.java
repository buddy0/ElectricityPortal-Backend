package com.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="https://localhost:4200")
@RestController
public class AdminController {
    @Autowired
	AdminService us;
    
    @PostMapping("/adminLogin")
	public String getUser(@RequestBody AdminCredential u) {
    	if(us.validateAdmin(u.getUsername(), u.getPassword())) {
    		return "Successful Login";
    	}
    	else {
    		return "Invalid Username and password combination"; 
    	}
	}
}
