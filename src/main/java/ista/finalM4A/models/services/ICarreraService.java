package ista.finalM4A.models.services;

import java.util.List;

import ista.finalM4A.models.entity.Carrera;


public interface ICarreraService {
	
	public List<Carrera> findAll();
	
	public Carrera save (Carrera Carrera);
	
	public Carrera findById(Long id);
	
	public void delete (Long id);
}
