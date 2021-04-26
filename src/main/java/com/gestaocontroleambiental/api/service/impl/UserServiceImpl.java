package com.gestaocontroleambiental.api.service.impl;

import com.gestaocontroleambiental.api.entity.User;
import com.gestaocontroleambiental.api.repository.UserRepository;
import com.gestaocontroleambiental.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User findUserByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}
	
	public User createOrUpdate(User user) {
		return this.userRepository.save(user);
	}
	
	public User findById(String id) {
		return this.userRepository.findOne(id);
	}
	
	public void delete(User user) {
		this.delete(user);
	}
	
	public Page<User> findAll(int page, int count) {
		Pageable pages = new PageRequest(page, count);
		return this.userRepository.findAll(pages);
	}
}
