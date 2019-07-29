package com.User;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
    UserRepo obj;
	
	public boolean validateUser(String username,String password)
	{
		Optional<UserCredential> val=obj.findById(username);
		if(val.isPresent()) {
			System.out.println(val.get().getUsername()+"---"+val.get().getPassword());
			if(val.get().getPassword().equals(password)) return true;
			else return false;
		}
		else return false;
	}
}
