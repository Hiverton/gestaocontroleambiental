package com.gestaocontroleambiental.api.repository;

import com.gestaocontroleambiental.api.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
	User findByEmail(String email);
}
