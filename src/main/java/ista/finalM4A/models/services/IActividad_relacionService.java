package ista.finalM4A.models.services;

import java.util.List;

import ista.finalM4A.models.entity.Actividad_relacion;;

public interface IActividad_relacionService {
	
public List<Actividad_relacion> findAll();
	
	public Actividad_relacion save (Actividad_relacion Actividad_relacion);
	
	public Actividad_relacion findById(Long id);
	
	public void delete (Long id);

}
