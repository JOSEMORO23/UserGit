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

import ista.finalM4A.models.entity.Actividad_relacion;
import ista.finalM4A.models.services.IActividad_relacionService;

@RestController
@RequestMapping("/api")

public class Actividad_relacionController {
	
	@Autowired
	public IActividad_relacionService actividad_relacionService;
	@GetMapping("/actividad_relacion")
	public List<Actividad_relacion> indext(){
		return actividad_relacionService.findAll();
	}
	
	@GetMapping("/actividad_relacion/{id}")
	public Actividad_relacion show(@PathVariable Long id) {
			return actividad_relacionService.findById(id);
			
	}
	
	@PostMapping("/actividad_relacion")
	@ResponseStatus(HttpStatus.CREATED)
	public Actividad_relacion create(@RequestBody Actividad_relacion Actividad_relacion) {
		return actividad_relacionService.save(Actividad_relacion);
	}
	
	@PutMapping("/actividad_relacion/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Actividad_relacion Actividad_relacion) {
		Actividad_relacion.setId(id);
		Actividad_relacion Actividad_relacionSave = actividad_relacionService.save(Actividad_relacion);
		return ResponseEntity.ok(Actividad_relacionSave);
	}
	
	@DeleteMapping("/actividad_relacion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable Long id) {
		actividad_relacionService.delete(id);
		
	}

}
