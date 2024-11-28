package ista.finalM4A.models.services;

import java.util.List;

import ista.finalM4A.models.entity.Roles;

public interface IRolesService {

public List<Roles> findAll();
	
	public Roles save (Roles Roles);
	
	public Roles findById(Long id);
	
	public void delete (Long id);
}
