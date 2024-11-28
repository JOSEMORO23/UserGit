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

import ista.finalM4A.models.entity.Periodo;
import ista.finalM4A.models.services.IPeriodoService;

@RestController
@RequestMapping("/api")

public class PeriodoController {
	
	@Autowired
	public IPeriodoService periodoService;
	@GetMapping("/periodo")
	public List<Periodo> indext(){
		return periodoService.findAll();
	}
	
	@GetMapping("/periodo/{id}")
	public Periodo show(@PathVariable Long id) {
			return periodoService.findById(id);
			
	}
	
	@PostMapping("/periodo")
	@ResponseStatus(HttpStatus.CREATED)
	public Periodo create(@RequestBody Periodo Periodo) {
		return periodoService.save(Periodo);
	}
	
	@PutMapping("/periodo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Periodo Periodo) {
		Periodo.setId(id);
		Periodo PeriodoSave = periodoService.save(Periodo);
		return ResponseEntity.ok(PeriodoSave);
	}
	
	@DeleteMapping("/periodo/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable Long id) {
		periodoService.delete(id);
		
	}

}
