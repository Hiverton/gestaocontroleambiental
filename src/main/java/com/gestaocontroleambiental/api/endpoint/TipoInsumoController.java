package com.gestaocontroleambiental.api.endpoint;

import com.gestaocontroleambiental.api.entity.TipoInsumo;
import com.gestaocontroleambiental.api.repository.TipoInsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/tipo-insumo")
public class TipoInsumoController {
	
	@Autowired
	private TipoInsumoRepository repository;
	
	@GetMapping
	public List<TipoInsumo> listar() {
		return repository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<TipoInsumo> criarTipoInsumo(@RequestBody TipoInsumo tipoInsumo){
		TipoInsumo ret = repository.save(tipoInsumo);
		return ResponseEntity.status(HttpStatus.CREATED).body(ret);
	}
}
