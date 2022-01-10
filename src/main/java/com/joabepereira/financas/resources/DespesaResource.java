package com.joabepereira.financas.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.joabepereira.financas.entities.Despesa;
import com.joabepereira.financas.services.DespesaService;

@RestController
@RequestMapping(value = "/despesas")
public class DespesaResource {
	
	@Autowired
	private DespesaService despesaService;
	
	@GetMapping
	public ResponseEntity<List<Despesa>> findAll() {
		List<Despesa> list = despesaService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Despesa> insert(@RequestBody Despesa despesa) {
		despesa = despesaService.insert(despesa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(despesa.getId()).toUri();
		return ResponseEntity.created(uri).body(despesa);
	}
}
