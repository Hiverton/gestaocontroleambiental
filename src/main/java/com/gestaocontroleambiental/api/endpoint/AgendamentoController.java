package com.gestaocontroleambiental.api.endpoint;

import com.gestaocontroleambiental.api.entity.Agendamento;
import com.gestaocontroleambiental.api.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/agendamento-manutencao")
public class AgendamentoController {
	
	@Autowired
	private AgendamentoRepository repository;
	
	@GetMapping
	public List<Agendamento> listar() {
		return repository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Agendamento> criarAgendamento(@RequestBody Agendamento agendamento){
		Agendamento ret = repository.save(agendamento);
		return ResponseEntity.status(HttpStatus.CREATED).body(ret);
	}

	@GetMapping("{id}")
	public ResponseEntity<Agendamento> getAgendamento(@PathVariable("id") String id) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.findById(id).orElse(null));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> deletarAgendamento(@PathVariable("id") String id) {
		repository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
}
