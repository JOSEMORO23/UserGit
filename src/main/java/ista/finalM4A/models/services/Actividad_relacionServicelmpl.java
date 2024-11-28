package ista.finalM4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.finalM4A.models.dao.IActividad_relacionDao;
import ista.finalM4A.models.entity.Actividad_relacion;

@Service
public class Actividad_relacionServicelmpl implements IActividad_relacionService{
	
	@Autowired
	private IActividad_relacionDao Actividad_relacionDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Actividad_relacion> findAll() {
		// TODO Auto-generated method stub
		return (List<Actividad_relacion>) Actividad_relacionDao.findAll();
	}

	@Override
	@Transactional
	public Actividad_relacion save(Actividad_relacion Actividad_relacion) {
		// TODO Auto-generated method stub
		return Actividad_relacionDao.save(Actividad_relacion);
	}

	@Override
	@Transactional (readOnly=true)
	public Actividad_relacion findById(Long id) {
		// TODO Auto-generated method stub
		return Actividad_relacionDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Actividad_relacionDao.deleteById(id);
		
	}
}
