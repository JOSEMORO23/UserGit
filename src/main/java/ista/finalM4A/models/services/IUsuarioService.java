package ista.finalM4A.models.services;

import java.util.List;

import ista.finalM4A.models.entity.Usuario;

public interface IUsuarioService {
	
public List<Usuario> findAll();
	
	public Usuario save (Usuario Usuario);
	
	public Usuario findById(Long id);
	
	public void delete (Long id);

}
