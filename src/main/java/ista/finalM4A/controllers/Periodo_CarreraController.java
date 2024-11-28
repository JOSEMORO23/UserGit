package ista.finalM4A.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ista.finalM4A.models.entity.Periodo_Carrera;
import ista.finalM4A.models.services.IPeriodo_CarreraService;

@RestController
@RequestMapping("/api")

public class Periodo_CarreraController {
	
	@Autowired
	public IPeriodo_CarreraService periodo_carreraService;
	@GetMapping("/periodo_Carreras")
	public List<Periodo_Carrera> indext(){
		return periodo_carreraService.findAll();
	}
	
	@GetMapping("/periodo_Carreras/{id}")
	public Periodo_Carrera show(@PathVariable Long id) {
			return periodo_carreraService.findById(id);
			
	}
	
	@PostMapping("/periodo_Carreras")
	@ResponseStatus(HttpStatus.CREATED)
	public Periodo_Carrera create(@RequestBody Periodo_Carrera Periodo_Carrera) {
		return periodo_carreraService.save(Periodo_Carrera);
	}
	
	@PutMapping("/periodo_Carreras/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Periodo_Carrera Periodo_Carrera) {
		Periodo_Carrera.setId(id);
		Periodo_Carrera Periodo_CarreraSave = periodo_carreraService.save(Periodo_Carrera);
		return ResponseEntity.ok(Periodo_CarreraSave);
	}
	
	@DeleteMapping("/periodo_Carreras/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable Long id) {
		periodo_carreraService.delete(id);
		
	}

}
