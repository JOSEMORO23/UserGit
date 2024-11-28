package ista.finalM4A.models.services;

import java.util.List;

import ista.finalM4A.models.entity.Actividades;

public interface IActividadesService {
	
public List<Actividades> findAll();
	
	public Actividades save (Actividades Actividades);
	
	public Actividades findById(Long id);
	
	public void delete (Long id);

}
