package com.gestaocontroleambiental.api.endpoint;

import com.gestaocontroleambiental.api.entity.Insumo;
import com.gestaocontroleambiental.api.repository.InsumoRepository;
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
@RequestMapping("/insumo")
public class InsumoController {
	
	@Autowired
	private InsumoRepository repository;
	
	@GetMapping
	public List<Insumo> listar() {
		return repository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Insumo> criarInsumo(@RequestBody Insumo insumo){
		Insumo ret = repository.save(insumo);
		return ResponseEntity.status(HttpStatus.CREATED).body(ret);
	}
}
