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

import ista.finalM4A.models.entity.Curso;
import ista.finalM4A.models.services.ICursoService;

@RestController
@RequestMapping("/api")

public class CursoController {
	
	@Autowired
	public ICursoService cursoService;
	@GetMapping("/cursos")
	public List<Curso> indext(){
		return cursoService.findAll();
	}
	
	@GetMapping("/cursos/{id}")
	public Curso show(@PathVariable Long id) {
			return cursoService.findById(id);
			
	}
	
	@PostMapping("/cursos")
	@ResponseStatus(HttpStatus.CREATED)
	public Curso create(@RequestBody Curso Curso) {
		return cursoService.save(Curso);
	}
	
	@PutMapping("/cursos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Curso Curso) {
		Curso.setId(id);
		Curso CursoSave = cursoService.save(Curso);
		return ResponseEntity.ok(CursoSave);
	}
	
	@DeleteMapping("/cursos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable Long id) {
		cursoService.delete(id);
		
	}

}
