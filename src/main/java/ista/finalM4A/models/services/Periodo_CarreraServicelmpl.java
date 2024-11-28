package ista.finalM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.finalM4A.models.dao.IPeriodo_CarreraDao;
import ista.finalM4A.models.entity.Periodo_Carrera;


@Service
public class Periodo_CarreraServicelmpl implements IPeriodo_CarreraService{
	
	@Autowired
	private IPeriodo_CarreraDao Periodo_CarreraDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Periodo_Carrera> findAll() {
		// TODO Auto-generated method stub
		return (List<Periodo_Carrera>) Periodo_CarreraDao.findAll();
	}

	@Override
	@Transactional
	public Periodo_Carrera save(Periodo_Carrera Periodo_Carrera) {
		// TODO Auto-generated method stub
		return Periodo_CarreraDao.save(Periodo_Carrera);
	}

	@Override
	@Transactional (readOnly=true)
	public Periodo_Carrera findById(Long id) {
		// TODO Auto-generated method stub
		return Periodo_CarreraDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Periodo_CarreraDao.deleteById(id);
		
	}

}
