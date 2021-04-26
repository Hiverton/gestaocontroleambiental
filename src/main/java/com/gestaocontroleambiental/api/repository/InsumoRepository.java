package com.gestaocontroleambiental.api.repository;

import com.gestaocontroleambiental.api.entity.Insumo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InsumoRepository extends MongoRepository<Insumo, String> {

}
