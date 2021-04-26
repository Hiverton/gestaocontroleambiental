package com.gestaocontroleambiental.api.repository;

import com.gestaocontroleambiental.api.entity.ChangeStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {
	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
	
}
