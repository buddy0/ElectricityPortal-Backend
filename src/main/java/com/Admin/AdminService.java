package com.Admin;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
    AdminRepo obj;
	
	public boolean validateAdmin(String username,String password)
	{
		Optional<AdminCredential> val=obj.findById(username);
		if(val.isPresent()) {
			if(val.get().getPassword().equals(password)) return true;
			else return false;
		}
		else return false;
	}
}
