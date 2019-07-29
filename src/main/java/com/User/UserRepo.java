package com.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserCredential,String> {

}
