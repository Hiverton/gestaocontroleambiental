package com.gestaocontroleambiental.api.repository;

import com.gestaocontroleambiental.api.entity.Agendamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgendamentoRepository extends MongoRepository<Agendamento, String> {

}
