package ista.finalM4A.models.services;

import java.util.List;

import ista.finalM4A.models.entity.Curso;


public interface ICursoService {
public List<Curso> findAll();
	
	public Curso save (Curso Curso);
	
	public Curso findById(Long id);
	
	public void delete (Long id);

}
