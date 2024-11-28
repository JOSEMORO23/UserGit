package ista.finalM4A.models.services;

import java.util.List;

import ista.finalM4A.models.entity.Periodo;


public interface IPeriodoService {
	
public List<Periodo> findAll();
	
	public Periodo save (Periodo Periodo);
	
	public Periodo findById(Long id);
	
	public void delete (Long id);

}
