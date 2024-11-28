package ista.finalM4A.models.services;

import java.util.List;

import ista.finalM4A.models.entity.Periodo_Carrera;

public interface IPeriodo_CarreraService {
	
public List<Periodo_Carrera> findAll();
	
	public Periodo_Carrera save (Periodo_Carrera Periodo_Carrera);
	
	public Periodo_Carrera findById(Long id);
	
	public void delete (Long id);

}
