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

import ista.finalM4A.models.entity.Roles;
import ista.finalM4A.models.services.IRolesService;

@RestController
@RequestMapping("/api")

public class RolesController {
	
	@Autowired
	public IRolesService rolesService;
	@GetMapping("/roles")
	public List<Roles> indext(){
		return rolesService.findAll();
	}
	
	@GetMapping("/roles/{id}")
	public Roles show(@PathVariable Long id) {
			return rolesService.findById(id);
			
	}
	
	@PostMapping("/roles")
	@ResponseStatus(HttpStatus.CREATED)
	public Roles create(@RequestBody Roles Roles) {
		return rolesService.save(Roles);
	}
	
	@PutMapping("/roles/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Roles Roles) {
		Roles.setId(id);
		Roles rolesSave = rolesService.save(Roles);
		return ResponseEntity.ok(rolesSave);
	}
	
	@DeleteMapping("/roles/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable Long id) {
		rolesService.delete(id);
		
	}

}
