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

import ista.finalM4A.models.entity.Carrera;
import ista.finalM4A.models.services.ICarreraService;



@RestController
@RequestMapping("/api")

public class CarreraController {
	
	@Autowired
	public ICarreraService carreraService;
	@GetMapping("/carreras")
	public List<Carrera> indext(){
		return carreraService.findAll();
	}
	
	@GetMapping("/carreras/{id}")
	public Carrera show(@PathVariable Long id) {
			return carreraService.findById(id);
			
	}
	
	@PostMapping("/carreras")
	@ResponseStatus(HttpStatus.CREATED)
	public Carrera create(@RequestBody Carrera Carrera) {
		return carreraService.save(Carrera);
	}
	
	@PutMapping("/carreras/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Carrera Carrera) {
		Carrera.setId(id);
		Carrera CarreraSave = carreraService.save(Carrera);
		return ResponseEntity.ok(CarreraSave);
	}
	
	@DeleteMapping("/carreras/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable Long id) {
		carreraService.delete(id);
		
	}

}
