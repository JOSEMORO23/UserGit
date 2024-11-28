package ista.finalM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.finalM4A.models.dao.ICarreraDao;
import ista.finalM4A.models.entity.Carrera;

@Service
public class CarreraServicelmpl implements ICarreraService{
	
	@Autowired
	private ICarreraDao carreraDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Carrera> findAll() {
		// TODO Auto-generated method stub
		return (List<Carrera>) carreraDao.findAll();
	}

	@Override
	@Transactional
	public Carrera save(Carrera Carrera) {
		// TODO Auto-generated method stub
		return carreraDao.save(Carrera);
	}

	@Override
	@Transactional (readOnly=true)
	public Carrera findById(Long id) {
		// TODO Auto-generated method stub
		return carreraDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carreraDao.deleteById(id);
		
	}

}
