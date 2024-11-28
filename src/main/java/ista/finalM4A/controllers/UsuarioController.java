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

import ista.finalM4A.models.entity.Usuario;
import ista.finalM4A.models.services.IUsuarioService;

@RestController
@RequestMapping("/api")

public class UsuarioController {
	
	@Autowired
	public IUsuarioService usuariosService;
	@GetMapping("/usuarios")
	public List<Usuario> indext(){
		return usuariosService.findAll();
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuario show(@PathVariable Long id) {
			return usuariosService.findById(id);
			
	}
	
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario Usuario) {
		return usuariosService.save(Usuario);
	}
	
	@PutMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Usuario Usuario) {
		Usuario.setId(id);
		Usuario UsuarioSave = usuariosService.save(Usuario);
		return ResponseEntity.ok(UsuarioSave);
	}
	
	@DeleteMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable Long id) {
		usuariosService.delete(id);
		
	}

}
