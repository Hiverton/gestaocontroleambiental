package com.gestaocontroleambiental.api.repository;

import com.gestaocontroleambiental.api.entity.Agendamento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AgendamentoRepository extends MongoRepository<Agendamento, String> {
     Optional<Agendamento> findById(String id);
}
