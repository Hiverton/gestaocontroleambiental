package com.gestaocontroleambiental.api.service;

import com.gestaocontroleambiental.api.entity.User;
import org.springframework.data.domain.Page;

public interface UserService {

	User findUserByEmail(String email);
	User createOrUpdate(User user);
	User findById(String id);
	void delete(User user);
	Page<User> findAll(int page, int count);
	
}
