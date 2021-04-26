package com.gestaocontroleambiental.api.repository;

import com.gestaocontroleambiental.api.entity.TipoInsumo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TipoInsumoRepository extends MongoRepository<TipoInsumo, String> {

}
